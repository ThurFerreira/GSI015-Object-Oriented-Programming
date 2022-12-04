public class Operario extends Funcionario{
    private int qtdProduzida;

    public Operario(){

    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    private void calcSalarial(int salario, int qtdProduzida){
        setSalario(salario * qtdProduzida);
    }
}
