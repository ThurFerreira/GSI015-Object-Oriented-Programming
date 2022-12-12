import java.time.LocalDate;

public class Trabalho extends Contato{
    private String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String imprimirContato() {
        return super.imprimirBasico() + "| Tipo: " + tipo;
    }
}
