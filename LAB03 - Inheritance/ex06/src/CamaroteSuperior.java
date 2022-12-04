public class CamaroteSuperior extends VIP{
    int valorAdicional;

    public void setValorAdicional(int valorAdicional){
        this.valorAdicional = valorAdicional;
    }

    public int getValorAdicional(){
        return valorAdicional;
    }

    public int getValorIngresso(){
        return (super.getIngressoVIP() + valorAdicional);
    }
}
