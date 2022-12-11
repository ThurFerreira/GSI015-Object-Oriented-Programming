public class FolhaPagamento extends Funcionario {

    private double folhaFinal;

    public FolhaPagamento(){
        this.folhaFinal = 0;
    }

    public double getFolhaFinal() {
        return folhaFinal;
    }

    public void setFolhaFinal(double folhaFinal) {
        this.folhaFinal = folhaFinal;
    }

    public void calcFolhaPagamento(Funcionario[] funcionarios) {
        for (Funcionario e : funcionarios) {
            setFolhaFinal((getFolhaFinal() + e.getSalario()));
        }
    }

    public void mostrarFolhaPagamento(Funcionario[] funcionarios){
        calcFolhaPagamento(funcionarios);
        for (Funcionario e: funcionarios) {
            e.pagamentos();
        }

        System.out.println("Valor total da folha de pagamento: " + getFolhaFinal());
    }

}
