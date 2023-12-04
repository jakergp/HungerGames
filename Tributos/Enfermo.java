package Tributos;

import java.util.Random;
import Tributos.State.*;

public class Enfermo extends Tributo{
    public Enfermo(String nombre, int distrito) {
        super(nombre, distrito);
        Random random = new Random();
        this.agilidad = random.nextInt(3) + 1;
        this.inteligencia = random.nextInt(3) + 1;
        this.combate = random.nextInt(2) + 2;
        this.setState(new Sano());
    }    
}
