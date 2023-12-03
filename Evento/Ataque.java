package Evento;

import java.util.ArrayList;
import Tributos.Tributo;

public class Ataque implements Evento{
    
    private String nombre;
    private ArrayList<Tributo> tributos;

    @Override
    public void iniciar() {
        //TODO:
    }

    @Override
    public void mostrar() {
        //TODO:
    }

    public String getNombre() {
        return nombre;
    }
}
