package Tributos;

public class Guerrero implements Tributo{

    public Guerrero (String nombre, int distrito) {
        Random random = new Random();
        this.agilidad =  random.nextInt(3) + 4 ;
        this.inteligencia = random.nextInt(2) + 2 ;
        this.combate = random.nextInt(4) + 7 ;
    }
    
}
