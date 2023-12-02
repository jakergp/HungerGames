
package Tributos.State;

import Tributos.Tributo;

public interface State {

    public void curar();
    public void herida();
    public void morir();
    public int getEstado();
    public void setTributo(Tributo tributo);

}