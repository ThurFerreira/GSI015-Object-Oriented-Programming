public class Vendedor extends Funcionario{
    protected int comissao;
    protected int vendas;

    public Vendedor(){
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    private void calcSalarial(int vendas, int comissao){
        super.setSalario(super.getSalario() + (comissao * vendas));
    }
}
