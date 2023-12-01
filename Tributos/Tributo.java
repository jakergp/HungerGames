package Tributos;

public class Tributo {

    private String nombre;
    private int distrito;
    private int vida;
    private int popularidad;
    private int agilidad;
    private int inteligencia;
    private int combate;

    public Tributo(String nombre, int distrito, int popularidad) {
        Random random = new Random();
        this.nombre = nombre;
        this.distrito = distrito;
        this.popularidad = random.nextInt(10) + 1;
        this.vida = 100;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        this.combate = combate;
    }
}
