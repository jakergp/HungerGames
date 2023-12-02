package Tributos.State;

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
    public setTributo(Tributo tributo) {
        this.tributo = tributo;
    }


    
}