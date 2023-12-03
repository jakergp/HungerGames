package Tributos.State;

import Tributos.Tributo;

class Sano implements State{
    private Tributo tributo;

    @Override
    public void curar(){
        if (this.tributo.getVida() < 100){
            this.tributo.setVida(tributo.getVida()+10);
        }
    }

    @Override
    public void herida(){
        this.tributo.setVida(tributo.getVida()-10);
        if (this.tributo.getVida() <= 30){
            tributo.setState(new Herido());
        }

    }

    @Override
    public void morir(){
    }

    @Override
    public int getCombate(){
        return this.tributo.getCombate();
    }

    @Override
    public int getAgilidad(){
        return this.tributo.getAgilidad();
    }

    @Override
    public int getInteligencia(){
        return this.tributo.getInteligencia();
    }

    @Override
    public void setTributo(Tributo tributo){
        this.tributo = tributo;
    }

    @Override
    public int getEstado() {
        return 2;
    }

}