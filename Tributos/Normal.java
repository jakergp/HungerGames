package Tributos;

public class Normal {
    public Normal(String nombre, int distrito) {
        Random random = new Random();
        this.agilidad = random.nextInt(3) + 1;
        this.inteligencia = random.nextInt(3) + 1;
        this.combate = random.nextInt(3) + 1;
    }    
}
