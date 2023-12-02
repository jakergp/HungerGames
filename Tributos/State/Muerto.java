package Tributos.State;

import Tributos.Tributo;

class Muerto implements State{
    private Tributo tributo;

    @Override
    public void curar() {
        
    }

    @Override
    public void herida() {
        
    }

    @Override
    public void morir() {
        
    }

    @Override
    public void setTributo(Tributo tributo) {
        this.tributo = tributo;
    }

    @Override
    public int getEstado() {
        return 0;
    }


    
}