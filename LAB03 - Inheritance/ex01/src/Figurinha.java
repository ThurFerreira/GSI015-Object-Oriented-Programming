//package LAB03\ -\ Inheritance.ex01.src;

import java.time.LocalDate;

public class Figurinha {

    private String nome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private String posicao;
    private String pais;

    Figurinha(String pais){
        this.pais = pais;
    }

    Figurinha(String nome, LocalDate dataNascimento, double altura, double peso, String posicao, String pais){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.pais = pais;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;

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

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }


    public void mostrarFigurinha(){
        System.out.println(this.nome);
        System.out.println(this.dataNascimento);
        System.out.println(this.altura);
        System.out.println(this.peso);
        System.out.println(this.posicao);
        System.out.println(this.pais);
        System.out.println("");
    }
}

