package Tributos.State;

class Herido implements State{
    private Tributo tributo;

    @Override
    public void curar(){
        this.tributo.setVida(tributo.getVida()-10);
        if (this.tributo.getVida() >= 30){
            tributo.setState(new Sano());
        }
    }

    @Override
    public void herida(){
        this.tributo.setVida(tributo.getVida()-10);
        if (this.tributo.getVida() == 0){
            tributo.setState(new Muerto());
        }

    }

    @Override
    public void morir(){
        tributo.setState(new Muerto());
    }

    @Override
    public setTributo(Tributo tributo){
        this.tributo = tributo;
    }

}