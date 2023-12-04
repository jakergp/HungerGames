package Tributos;

import java.util.Random;
import java.io.Serializable;
import Tributos.State.*;

public class Tributo implements Serializable{

    private State estado;
    public String nombre;
    public int distrito;
    public int vida;
    public int popularidad;
    public int agilidad;
    public int inteligencia;
    public int combate;

    public Tributo(String nombre, int distrito) {
        Random random = new Random();
        this.nombre = nombre;
        this.distrito = distrito;
        this.popularidad = random.nextInt(10) + 1;
        this.vida = 100;
        this.setState(new Sano());
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (this.vida > 100){
            this.vida = 100; 
        }
        else {
            this.vida = vida;
        }
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public int getAgilidad() {
        return this.estado.getAgilidad();
    }

    public int getInteligencia() {
        return this.estado.getInteligencia(); }

    public int getCombate() {
        return this.estado.getCombate();
    }

    public void setState(State estado) {
        this.estado = estado;
        this.estado.setTributo(this);
    }

    public void curar() {
        this.estado.curar();
    }

    public void herida(){
        this.estado.herida();
    }

    public void heridaLeve() {
        this.estado.heridaLeve();
    }

    public void morir() {
        this.estado.morir();
    }

    public int getEstado() {
        return this.estado.getEstado();
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
