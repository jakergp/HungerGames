package JuegosDelHambre;

import java.util.ArrayList;
import Tributos.Tributo;
import Evento.*;

public class Juegos {

    Periodo periodoActual;
    ArrayList<Tributo> tributos;
    ArrayList<Evento> listaEventosMayores;
    ArrayList<Evento> listaEventosMenores;

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
            enfrentamiento.iniciar();
        }
    }

    public void eliminarTributo (Tributo tributo) {

    }

    public void notificarMuerte(Tributo asesinado, Tributo asesino){
        System.out.println("El tributo " + asesinado.getNombre() + " fue asesinado por " + asesino.getNombre());
    }

    public void notificarMuerte(Tributo asesinado, Ataque ataque){
        System.out.println("El tributo " + asesinado.getNombre() + "  a causa de " + ataque.getNombre());
    }

    public void notificarMuerte(Tributo asesinado, Desastre desastre){
        System.out.println("El tributo " + asesinado.getNombre() + "  a causa de " + desastre.getNombre());
    }

    public void notificarPeriodo(Periodo periodo) {
        System.out.println("Dia " + periodo.getDia());
        System.out.println("Hora " + periodo.getHora() + ":00");
    }
}
