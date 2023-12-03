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
        Random = new Random();
        this.nombre = nombre;
        ArrayList<Tributo> listaT=observador.getTributos();
        for (int i=0; i<5; i++){
          int index=random.nextInt(listaT.size());
          this.tributos.add(listaT.get(index));
          listaT.remove(index);
      }
    }

    @Override
    public void iniciar() {
      for (Tributo tributo : tributos) {
        int agilidad=tributo.getAgilidad()*0.1;
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
      System.out.println("Ocurrió un desastre" +this.nombre);
      System.out.println("Tributos que no sobrevivieron: ");
      for(Tributo tributo: muertos){
        System.out.println(tributo.getNombre());
      }
        
    }

    public String getNombre() {
        return nombre;
    }
}
