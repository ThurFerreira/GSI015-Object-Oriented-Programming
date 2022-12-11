import java.time.LocalDate;

public class Vendedor extends Funcionario{
    protected int comissao;
    protected int vendas;

    public Vendedor(){
    }

    public Vendedor(String nome, LocalDate dataNascimento, int salario, int comissao,int vendas){
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
        this.vendas = vendas;
        calcSalarial();
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

    private void calcSalarial(){
        super.setSalario(getSalario() + (comissao * vendas));
    }

    public void pagamentos(){
        System.out.println("nome: " + getNome() + " | " + "salario: " + getSalario() + ".");
    }
}
