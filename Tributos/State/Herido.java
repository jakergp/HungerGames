package Tributos.State;

import Tributos.Tributo;

class Herido implements State{
    private Tributo tributo;

    @Override
    public void curar(){
        this.tributo.setVida(tributo.getVida()+30);
        if (this.tributo.getVida() >= 30){
            tributo.setState(new Sano());
        }
    }
    
    @Override
    public void herida(){
        this.tributo.setVida((int)(tributo.getVida()*.5));
    }

    @Override
    public void heridaLeve(){
        this.tributo.setVida((int)(tributo.getVida()*.8));
    }
    @Override
    public void morir(){
        tributo.setState(new Muerto());
    }

    @Override
    public int getCombate(){
        return (int)(this.tributo.getCombate()*.7);
    }

    @Override
    public int getAgilidad(){
        return (int)(this.tributo.getAgilidad()*.7);
    }

    @Override
    public int getInteligencia(){
        return (int)(this.tributo.getInteligencia()*.7);
    }

    @Override
    public void setTributo(Tributo tributo){
        this.tributo = tributo;
    }

    @Override
    public int getEstado() {
        return 1;
    }

}