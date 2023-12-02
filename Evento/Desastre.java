package Evento;

import java.util.ArrayList;

import Tributos.Tributo;

public class Desastre implements Evento{
    private String nombre;
    private ArrayList<Tributo> tributos;

    public Desastre(String nombre, ArrayList<Tributo> listaTributos) {
        this.nombre = nombre;
            
    }

    @Override
    public void iniciar() {
        //TODO: Iniciar evento
    }

    @Override
    public void mostrar() {
        //TODO: Mostrar Evento
    }

}
