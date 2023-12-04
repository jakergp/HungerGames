package Tributos;

import java.util.Random;
import Tributos.State.*;

public class Guerrero extends Tributo{

    public Guerrero (String nombre, int distrito) {
        super(nombre, distrito);
        Random random = new Random();
        this.agilidad =  random.nextInt(3) + 4 ;
        this.inteligencia = random.nextInt(2) + 2 ;
        this.combate = random.nextInt(4) + 7 ;
        this.setState(new Sano());
    }
    
}
