package ex05;

public class Selecao {
    
    private String nome;
    private int qtdTitulos;
    private String tecnico;
    private String pais;

    private Figurinha[] titulares = new Figurinha[11];
    
    Selecao(String nome, String tecnico, String pais){
        
        this.nome = nome;
        this.tecnico = tecnico;
        this.pais = pais;
        
        for(int i = 0; i < 11; i++){
            titulares[i] = new Figurinha(pais);
        }
    }
}
