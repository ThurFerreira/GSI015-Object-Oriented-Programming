public class Ingresso {
    private int valor;

    Ingresso(){

    }

    Ingresso(int valor){
       this.valor = valor;
    }

    public void escreveValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return this.valor;
    }
}
