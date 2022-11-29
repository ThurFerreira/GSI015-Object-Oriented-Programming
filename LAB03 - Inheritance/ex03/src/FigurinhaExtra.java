import java.time.LocalDate;

public class FigurinhaExtra extends Figurinha {

    private String categoria;
    private String cor;

    FigurinhaExtra(String nome, LocalDate dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor){
        super(nome, dataNascimento, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    FigurinhaExtra(Figurinha figurinha, String categoria, String cor){
        super(figurinha.getNome(), figurinha.getDataNascimento(), figurinha.getAltura(), figurinha.getPeso(), figurinha.getPosicao(), figurinha.getPais());
        this.categoria = categoria;
        this.cor = cor;

    }

    public String getCategoria() {
        return categoria;
    }
    public String getCor() {
        return cor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrarFigurinhaExtra(){
        System.out.println(this.getNome());
        System.out.println(this.getDataNascimento());
        System.out.println(this.getAltura());
        System.out.println(this.getPeso());
        System.out.println(this.getPosicao());
        System.out.println(this.getPais());
        System.out.println(this.categoria);
        System.out.println(this.cor);
        System.out.println("");
    }
}