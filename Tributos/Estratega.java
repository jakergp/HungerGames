package Tributos;

import java.util.Random;

public class Estratega extends Tributo{

    public Estratega (String nombre, int distrito) {
        super(nombre, distrito);
        Random random = new Random();
        this.agilidad = random.nextInt(4) + 2;
        this.inteligencia = random.nextInt(2) + 9;
        this.combate = random.nextInt(4) + 1;
    }    
}
