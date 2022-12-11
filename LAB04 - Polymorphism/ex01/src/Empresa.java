import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args) {


    FolhaPagamento FolhaDePagamentos = new FolhaPagamento();

    Funcionario []funcionarios = new Funcionario[4];
    funcionarios[0] = new Chefe("antonio", LocalDate.now(), 180000);
    funcionarios[1] = new Horistas("jurupinga", LocalDate.now(), 5, 48);
    funcionarios[2] = new Vendedor("amauri", LocalDate.now(), 1250, 300, 740);
    funcionarios[3] = new Operario("jonas", LocalDate.now(), 10, 5204);

    FolhaDePagamentos.mostrarFolhaPagamento(funcionarios);

    }
}