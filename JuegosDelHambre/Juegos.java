package JuegosDelHambre;

import java.util.ArrayList;
import Tributos.Tributo;
import Evento.*;

public class Juegos {

    Periodo periodoActual;
    ArrayList<Tributo> tributos;
    ArrayList<Evento> listaEventosMayores;

    public Juegos(ArrayList<Tributo> tributos) {
       this.tributos = tributos;
       listaEventosMayores = new ArrayList<>();
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
        for (i = 0; i < 5; i++) {
            enfrentamiento = new Enfrentamiento(this);
            enfrentamiento.mostrar();
            enfrentamiento.iniciar();
        }
        empezarPeriodo();
    }

    public void empezarPeriodo() {
        periodoActual = new Periodo(this);
        periodoActual.iniciar();
        if(tributos.size() > 1) {
            empezarPeriodo();
        }
    }

    public void notificarMuerte(Tributo asesinado, Evento evento){
        asesinado.morir();
        tributos.remove(asesinado);
        System.out.println("El tributo " + asesinado.getNombre() + " a causa de: " + evento);
    }

    public void notificarPeriodo(Periodo periodo) {
        System.out.println("Dia " + periodo.getDia());
        System.out.println("Hora " + periodo.getHora() + ":00");
    }
}
