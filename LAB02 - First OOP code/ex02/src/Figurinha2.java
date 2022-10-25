import java.time.LocalDate;

public class Figurinha2 {
    
    private String nome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;
    
    Figurinha2(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void show(){
        System.out.println(this.nome);
        System.out.println(this.dataNascimento);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.posicao);
        System.out.println(this.pais);
        System.out.println("");
    }

}
