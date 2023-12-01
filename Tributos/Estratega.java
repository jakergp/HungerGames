package Tributos;

public class Estratega implements Tributo{

    public Estratega (String nombre, int distrito) {
        Random random = new Random();
        this.inteligencia = random.nextInt(10) + 1
       
    }
    
}
