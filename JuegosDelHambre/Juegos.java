package JuegosDelHambre;

import java.util.ArrayList;
import Tributos.Tributo;
import Evento.*;

public class Juegos {

    Observador observador;
    ArrayList<Tributo> tributos;
    ArrayList<Periodo> periodos;
    ArrayList<Evento> listaEventosMayores;
    int vivos;

    public  Juegos(Observador observador, ArrayList<Tributo> tributos) {
       this.observador = observador;
       this.tributos = tributos;
    }

}
