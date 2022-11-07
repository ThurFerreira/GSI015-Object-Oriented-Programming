package ex04;

public class Selecao {
    
    private String nome;
    private int qtdTitulos;
    private String tecnico;
    private String pais;
    private Figurinha[] titulares = new Figurinha[11];

    Selecao(){
        for(int i = 0; i < 11; i++){
            titulares[i] = new Figurinha();
        }
    }
}