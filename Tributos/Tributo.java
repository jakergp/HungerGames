package Tributos;

public class Tributo {

    private String nombre;
    private int distrito;
    private int vida;
    private int popularidad;
    private int agilidad;
    private int inteligencia;
    private int combate;
    private State estado;

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
        if (this.vida == 0) {
            System.out.println("El tributo esta muerto");
        }
    }

    public void setVida(int vida) {
        if (this.vida > 0) {
            this.vida = vida;
            if (this.vida > 100){
                this.vida = 100; 
            }
        }
        else {
            System.out.println("ERROR. El tributo esta muerto");
        }
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
        if (this.popularidad > 10){
                this.popularidad = 10; 
        }
        else {
            System.out.println("El numero debe ser entre 1 y 10");
        }
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
        if (this.agilidad > 10){
                this.agilidad = 10; 
        }
        else {
            System.out.println("El numero debe ser entre 1 y 10");
        }
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
        if (this.inteligencia > 10){
                this.inteligencia = 10; 
        }
        else {
            System.out.println("El numero debe ser entre 1 y 10");
        }
    }

    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        this.combate = combate;
        if (this.combate > 10){
                this.combate = 10; 
        }
        else {
            System.out.println("El numero debe ser entre 1 y 10");
        }
    }


    public void setState(State estado) {
        this.estado = estado;
        this.estado.setTributo(this);
    }
}
