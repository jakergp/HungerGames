package JuegosDelHambre;

import java.util.ArrayList;
import java.util.Random;
import Evento.*;

public class Periodo {

   private static int horaActual = 12;
   private static int diaActual;
   private int hora, dia;
   private ArrayList<Evento> eventos;
   private Juegos juegos;

   public Periodo(Juegos juegos) {
      this.juegos = juegos;
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

   public void setHora(int hora) {
      this.hora = hora;
   }

   public ArrayList<Evento> getEventos() {
      return eventos;
   }

   public void setEventos(ArrayList<Evento> eventos) {
      this.eventos = eventos;
   }

   public int getDia() {
      return dia;
   }

   public void setDia(int dia) {
      this.dia = dia;
   }

   public ArrayList<Evento> generarEventos(Juegos juegos) {
      Random random = new Random();
      ArrayList<Evento> eventos = new ArrayList<>();
      ArrayList<Evento> eventosMayores = juegos.listaEventosMayores;
      eventos.add(eventosMayores.get(random.nextInt(eventosMayores.size())));
      eventos.add(new Enfrentamiento(juegos));
      eventos.add(new Donacion());

      return eventos;
   }

   public void iniciarEventos() {
      for (Evento evento: eventos) {
         evento.iniciar();
      }
   }
}
