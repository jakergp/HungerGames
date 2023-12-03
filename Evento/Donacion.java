package Evento;

import Tributos.Tributo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import JuegosDelHambre.*;

public class Donacion implements Evento {
   
    private ArrayList<Tributo> tributos;
    private Juegos observador;

    public Donacion(Juegos observador) {
        this.observador = observador;
        this.tributos = observador.getTributos();
    }

    @Override
    public void iniciar() {
        Random random = new Random();
        Collections.shuffle(tributos); 
        for(Tributo tributo: tributos) {
            double probabilidad = tributo.getPopularidad() * 0.1;
            double aleatorio = random.nextDouble() * 1.5;
            if(aleatorio < probabilidad){
               tributo.curar();
               observador.notificarDonacion(tributo);
               break; 
            }
        }
    }

    @Override
    public void mostrar() {
       System.out.println("Se esta realizando una donación.");
    }
}

