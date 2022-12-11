import java.time.LocalDate;

public class Chefe extends Funcionario {

    public Chefe() {
    }

    public Chefe(String nome, LocalDate dataNascimento, int salario) {
        super(nome, dataNascimento, salario);
    }

    public void pagamentos(){
        System.out.println("nome: " + getNome() + " | " + "salario: " + getSalario() + ".");
    }
}
