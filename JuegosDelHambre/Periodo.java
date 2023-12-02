package JuegosDelHambre;

import java.util.ArrayList;

import Evento.*;

public class Periodo {

   private static int horaActual = 12;
   private static int diaActual;
   private int hora;
   private ArrayList<Evento> eventos;
   private int dia;

   public Periodo(ArrayList<Evento> eventos) {
      this.eventos = eventos;
      horaActual += 3;
      if (horaActual == 24) {
         horaActual = 0;
         diaActual++;
      }
      this.hora = horaActual;
      this.dia = diaActual;
   }

   public Periodo() {
      this.eventos = generarEventos();
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


}
