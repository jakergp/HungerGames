package JuegosDelHambre.Evento;

import Tributos.Tributo;
import java.util.Random;
public class Enfrentamiento implements Evento{

    Tributo tributo1, tributo2;

    public Enfrentamiento(Tributo tributo1, Tributo tributo2) {
        this.tributo1 = tributo1;
        this.tributo2 = tributo2;
    }
    @Override
    public void iniciar() {
        Random random = new Random();
        double duelo = random.nextDouble();
        if (duelo < 0.5) {
            //TODO: Gana tributo 1
        }
        else {
            //TODO: Gana tributo 2
        }
    }

    @Override
    public void mostrar() {
        //TODO: Mostrar tributos en el enfrentamiento.
    }
}
