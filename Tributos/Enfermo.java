package Tributos;

public class Enfermo {
    public Enfermo(String nombre, int distrito) {
        Random random = new Random();
        this.agilidad = random.nextInt(3) + 1;
        this.inteligencia = random.nextInt(3) + 1;
        this.combate = random.nextInt(3) + 1;
    }    
}
