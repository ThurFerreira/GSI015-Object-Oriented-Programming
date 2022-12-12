import java.time.LocalDate;

public class Familia extends Contato{
    private String parentesco;
    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    @Override
    public String imprimirContato() {
         return super.imprimirBasico() + " | Parentesco: " + parentesco;
    }
}
