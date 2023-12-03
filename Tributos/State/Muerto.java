package Tributos.State;

import Tributos.Tributo;

class Muerto implements State{

    @Override
    public void curar() {}

    @Override
    public void herida() {}

    @Override
    public void morir() {}
    
    @Override
    public void setTributo(Tributo tributo) {}

    @Override
    public int getCombate(){
        return 0;
    }

    @Override
    public int getAgilidad(){
        return 0;
    }

    @Override
    public int getInteligencia(){
        return 0;
    }

    @Override
    public int getEstado() {
        return 0;
    }
    
}