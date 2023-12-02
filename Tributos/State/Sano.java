package Tributos.State;
 
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
    public setTributo(Tributo tributo){
        this.tributo = tributo;
    }


    
}