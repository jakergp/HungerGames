package Tributos;

import java.util.Random;

public class Cazador implements Tributo{
    public Arquero (String nombre, int distrito) {
        Random random = new Random();
        this.agilidad = random.nextInt(3) + 8; 
        this.inteligencia = random.nextInt(3) + 2;
        this.combate = random.nextInt(3) + 5;
    }

}
