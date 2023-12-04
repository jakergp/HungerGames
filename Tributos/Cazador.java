package Tributos;

import java.util.Random;
import Tributos.State.*;

public class Cazador extends Tributo{
    public Cazador (String nombre, int distrito) {
        super(nombre, distrito);
        Random random = new Random();
        this.agilidad = random.nextInt(3) + 8; 
        this.inteligencia = random.nextInt(3) + 2;
        this.combate = random.nextInt(3) + 5;
        this.setState(new Sano());
    }
}
