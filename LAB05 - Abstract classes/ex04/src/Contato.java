import java.time.LocalDate;

public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public String imprimirBasico(){
        return "Nome: " + nome + " | Apelido: " + apelido + " | Email: " + email + " | Aniversario: " + aniversario;
    }

    public abstract String imprimirContato();

}
