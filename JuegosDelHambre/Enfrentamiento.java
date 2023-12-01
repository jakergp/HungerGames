package JuegosDelHambre;

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
        int suma = tributo1.getCombate() + tributo2.getCombate();
        double limite = (tributo1.getCombate()) / suma;
        if (duelo < limite) {
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
