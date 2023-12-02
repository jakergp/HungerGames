package Tributos;

import java.util.Random;

public class Normal extends Tributo{
    public Normal(String nombre, int distrito) {
        super(nombre, distrito);
        Random random = new Random();
        this.agilidad = random.nextInt(3) + 1;
        this.inteligencia = random.nextInt(3) + 1;
        this.combate = random.nextInt(3) + 1;
    }    
}
