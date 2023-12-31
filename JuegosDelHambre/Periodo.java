package JuegosDelHambre;

import java.util.ArrayList;
import java.util.Random;
import Evento.*;

public class Periodo {

   private static int horaActual = 12;
   private static int diaActual = 1;
   private int hora, dia;
   private ArrayList<Evento> eventos;
   private Juegos observador;

   public Periodo(Juegos juegos) {
      this.observador = juegos;
      this.eventos = generarEventos(juegos);
      horaActual += 3;
      if (horaActual == 24) {
         horaActual = 0;
         diaActual++;
      }
      this.hora = horaActual;
      this.dia = diaActual;
   }
   
   public int getHora() {
      return hora;
   }

   public int getDia() {
      return dia;
   }

   public ArrayList<Evento> generarEventos(Juegos juegos) {
      Random random = new Random();
      ArrayList<Evento> eventos = new ArrayList<>();
      ArrayList<Evento> eventosMayores = juegos.listaEventosMayores;
      int index = random.nextInt(eventosMayores.size());
      eventos.add(eventosMayores.get(index));
      eventos.add(new Enfrentamiento(juegos));
      eventos.add(new Donacion(juegos));
      eventosMayores.remove(index);
      return eventos;
   }

   public void iniciar() {
      observador.notificarPeriodo(this);
      for (Evento evento: eventos) {
         evento.mostrar();
         evento.iniciar();
      }
   }
}
