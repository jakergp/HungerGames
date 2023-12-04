package JuegosDelHambre;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

import Tributos.Tributo;
import Evento.*;

public class Juegos {

    Periodo periodoActual;
    ArrayList<Tributo> tributos;
    ArrayList<Evento> listaEventosMayores = new ArrayList<>();

    public Juegos(ArrayList<Tributo> tributos) {
       this.tributos = tributos;
       listaEventosMayores.add(new Ataque("Lobos", this));
       listaEventosMayores.add(new Ataque("Monos", this));
       listaEventosMayores.add(new Ataque("Avispas", this));
       listaEventosMayores.add(new Desastre("Terremoto", this));
       listaEventosMayores.add(new Desastre("Incendio", this));
       listaEventosMayores.add(new Desastre("Tormenta", this));
    }

    public ArrayList<Tributo> getTributos() {
        return tributos;
    }

    public void iniciar() {
        Enfrentamiento enfrentamiento;
        int i = 3;
        System.out.println("Los juegos comenzaran en: ");
        while (i > 0) { 
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            i--;
        }
        System.out.println("Comienzan los juegos del hambre.");
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            enfrentamiento = new Enfrentamiento(this);
            enfrentamiento.mostrar();
            enfrentamiento.iniciar();
        }
        scanner.nextLine();
        empezarPeriodo();
    }

    public void empezarPeriodo() {
        Scanner scanner = new Scanner(System.in);
        periodoActual = new Periodo(this);
        periodoActual.iniciar();
        scanner.nextLine();
        if(tributos.size() > 5) {
            empezarPeriodo();
        }
        else {
            enfrentamientoFinal();
        }
        
    }

    public void enfrentamientoFinal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enfrentamiento final.");
        System.out.println("Tributos restantes: " + tributos.size());
        while(tributos.size() > 1) {
            Enfrentamiento enfrentamiento = new Enfrentamiento(this);
            enfrentamiento.mostrar();
            enfrentamiento.iniciar();
            scanner.nextLine();
        }
        if (tributos.size() == 1) {
            for(Tributo tributo: tributos) {
                System.out.println("El ganador de los juegos del hambre es " 
                + tributo.getNombre() + " del distrito " + tributo.distrito + ".");
                scanner.nextLine();
            }
        }
    }
        
    public void notificarMuerte(Tributo asesinado, Evento evento){
        asesinado.morir();
        tributos.remove(asesinado);
        System.out.println("El tributo " + asesinado.getNombre() + " ha muerto a causa de" + evento);
    }

    public void notificarPeriodo(Periodo periodo) {
        System.out.println("Dia " + periodo.getDia());
        System.out.println("Hora " + periodo.getHora() + ":00");
        System.out.println("Tributos restantes: " + tributos.size());
    }

    public void notificarDonacion(Tributo tributo) {
        System.out.println("\nEl tributo " + tributo.getNombre() + " ha recibido una donacion.");
    }
}
