import java.time.LocalDate;

public class Operario extends Funcionario{
    private int qtdProduzida;
    private int valorProducao;

    public Operario(){

    }

    public Operario(String nome, LocalDate dataNascimento, int qtdProduzida, int valorProducao){
        super(nome, dataNascimento, 0);
        this.qtdProduzida = qtdProduzida;
        this.valorProducao = valorProducao;
        calcSalarial();
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public int getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(int valorProducao) {
        this.valorProducao = valorProducao;
    }

    private void calcSalarial(){
        setSalario(valorProducao * qtdProduzida);
    }

    public void pagamentos(){
        System.out.println("nome: " + getNome() + " | " + "salario: " + getSalario() + ".");
    }
}
