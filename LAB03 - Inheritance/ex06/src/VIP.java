public class VIP extends Ingresso{
    private int adicional;

    VIP(){

    }

    VIP(int valor, int adicional){
        super(valor);
        this.adicional = adicional;
    }

    public void serAdicional(int adicional){
        this.adicional = adicional;
    }

    public int getAdicional(){
        return this.adicional;
    }

    public int getIngressoVIP(){
        return (super.getValor() + adicional);
    }
}
