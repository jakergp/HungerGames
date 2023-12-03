package Evento;
import java.util.ArrayList;
import JuegosDelHambre.Juegos;
import Tributos.Tributo;
import java.util.Random;

public class Ataque implements Evento{
  Juegos observador;
  private String nombre;
  private ArrayList<Tributo> tributos=new ArrayList<>();
  private ArrayList<Tributo> muertos=new ArrayList<>();

  public Ataque(String nombre, Juegos observador){
    this.nombre=nombre;
    Random random=new Random();
    ArrayList<Tributo> listaT = new ArrayList<>(observador.getTributos());
    for (int i=0; i<5; i++){
      int index=random.nextInt(listaT.size());
      this.tributos.add(listaT.get(index));
      listaT.remove(index);
    }
    
  }

    @Override
    public void iniciar() {
      for (Tributo tributo : tributos) {
        double combate = tributo.getCombate()*0.1;
        if (Math.random()<combate){
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
      System.out.println("Ocurrió un ataque: "+ this.getNombre());
      System.out.println("Los siguientes tributos no sobrevivieron:");
      for (Tributo tributo : muertos) {
        System.out.println(tributo.getNombre());
      }
  
    }

    public String getNombre() {
        return nombre;
    }
}

