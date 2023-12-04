package Evento;

import java.util.ArrayList;
import JuegosDelHambre.Juegos;
import java.util.Random;
import Tributos.Tributo;

public class Desastre implements Evento{
    private String nombre;
    private ArrayList<Tributo> tributos=new ArrayList<>();
    private ArrayList<Tributo> muertos=new ArrayList<>();
    Juegos observador;
    
    public Desastre(String nombre, Juegos observador) {
        this.observador = observador;
        this.nombre = nombre;
    }

    @Override
    public void iniciar() {
        Random random = new Random();
        ArrayList<Tributo> listaT = new ArrayList<>(observador.getTributos());
        for (int i=0; i<5; i++){
            int index = random.nextInt(listaT.size());
            this.tributos.add(listaT.get(index));
            listaT.remove(index);
        }
        for (Tributo tributo: tributos) {
            double agilidad = tributo.getAgilidad() * 0.1;
            if (Math.random()<agilidad){
                tributo.herida();
            }
            else {
                observador.notificarMuerte(tributo, this); 
                this.muertos.add(tributo);
            }
        }
    }

    @Override
    public void mostrar() {
        System.out.println("\nOcurrió un desastre: " +this.nombre);
    }

    @Override
    public String toString(){
        return  " " + this.nombre;
    }

}
