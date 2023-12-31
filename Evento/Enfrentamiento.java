package Evento;

import JuegosDelHambre.Juegos;
import Tributos.Tributo;
import java.util.ArrayList;
import java.util.Random;

public class Enfrentamiento implements Evento{

    Tributo tributo1, tributo2;
    Juegos observador;

    public Enfrentamiento(Juegos observador) {
        Random random = new Random();
        this.observador = observador;
        ArrayList<Tributo> tributos = observador.getTributos();
        int index1 = random.nextInt(tributos.size());
        int index2 = random.nextInt(tributos.size());
        while (index1 == index2) {
            index2 = random.nextInt(tributos.size());
        }
        this.tributo1 = tributos.get(index1);
        this.tributo2 = tributos.get(index2);
    }

    @Override
    public void iniciar() {
        Random random = new Random();
        double duelo = random.nextDouble();
        int atributos1 = tributo1.getCombate() + tributo1.getAgilidad() + tributo1.getInteligencia();
        int atributos2 = tributo2.getCombate() + tributo2.getAgilidad() + tributo2.getInteligencia();
        double suma = atributos1 + atributos2;
        double limite = atributos1 / suma;
        if (duelo < limite) {
            observador.notificarMuerte(tributo1, this);
            tributo2.setPopularidad(tributo2.getPopularidad() + 1);
            tributo2.heridaLeve();
        }
        else {
            observador.notificarMuerte(tributo2, this);
            tributo1.setPopularidad(tributo2.getPopularidad() + 1);
            tributo1.heridaLeve();
        }
    }

    @Override
    public void mostrar() {
        System.out.println("\nEnfrentamiento entre: " + tributo1.getNombre() + " y " + tributo2.getNombre());
    }

    @Override
    public String toString(){
        return "l enfrentamiento";
    }
}
