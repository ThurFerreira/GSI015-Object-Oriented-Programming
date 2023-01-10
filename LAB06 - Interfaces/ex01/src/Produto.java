public class Produto implements Classificavel{

    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Produto compare = (Produto) obj;
        if(this.codigo < compare.getCodigo())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + '}';
    }
}
