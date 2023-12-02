package Tributos;

import java.util.Random;
import java.io.Serializable;

public class Tributo implements Serializable{

    String nombre;
    int distrito;
    int vida;
    int popularidad;
    int agilidad;
    int inteligencia;
    int combate;

    public Tributo(){
      
    }
  
    public Tributo(String nombre, int distrito) {
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

  public void display(){
    System.out.print(this.nombre + "\t");
    System.out.print(this.distrito + "\t");
    System.out.print(this.vida + "\t");
    System.out.print(this.popularidad + "\t");
    System.out.print(this.agilidad + "\t");
    System.out.print(this.inteligencia + "\t");
    System.out.print(this.combate + "\t");
  }
}
