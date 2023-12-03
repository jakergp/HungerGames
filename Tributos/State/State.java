
package Tributos.State;

import Tributos.Tributo;

public interface State {

    void curar();
    void herida();
    void heridaLeve();
    void morir();
    int getCombate();
    int getAgilidad();
    int getInteligencia();
    int getEstado();
    void setTributo(Tributo tributo);

}