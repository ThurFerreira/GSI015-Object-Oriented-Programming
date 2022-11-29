import java.time.LocalDate;

public class FigurinhaExtra extends Figurinha {

    private String categoria;
    private String cor;

    FigurinhaExtra(String nome, LocalDate dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor){
        super(nome, dataNascimento, altura, peso, posicao, pais);
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
        System.out.println(this.nome);
        System.out.println(this.dataNascimento);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.posicao);
        System.out.println(this.pais);
        System.out.println(this.categoria);
        System.out.println(this.cor);
        System.out.println("");
    }
}