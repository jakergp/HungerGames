
package Tributos.State;

import Tributos.Tributo;

public interface State {

    public void curar();
    public void herida();
    public void heridaLeve();
    public void morir();
    public int getCombate();
    public int getAgilidad();
    public int getInteligencia();
    public int getEstado();
    public void setTributo(Tributo tributo);


}