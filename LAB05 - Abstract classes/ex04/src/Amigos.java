import java.time.LocalDate;

public class Amigos extends Contato{
    private int grau; // 1- melhor amigo | 2 = amigo | 3 = conhecido).
    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    @Override
    public String imprimirContato() {

        if(grau == 1)
            return super.imprimirBasico() + " | Grau de Amizadee: Melhor Amigo";

        else if(grau == 2)
            return super.imprimirBasico() + " | Grau de Amizadee: Amigo";

        else
            return super.imprimirBasico() + " | Grau de Amizadee: Conhecido";
    }
}
