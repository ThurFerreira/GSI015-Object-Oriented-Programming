public class Cliente implements Classificavel{

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Cliente compare = (Cliente) obj;
        int lmin = Math.min(nome.length(), compare.getNome().length());

        //compara as strings caracter por caracter
        for(int i = 0; i < lmin; i++){

            if(nome.charAt(i) != compare.getNome().charAt(i)){
                if(nome.charAt(i) < compare.getNome().charAt(i))
                    return true;
                else
                    return false;
            }
        }

       //se as palavras forem iguais ate certo ponto, mas uma for menor que a outra
        if(lmin == nome.length()){
            return true;
        }
        else{
            return false;
        }
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
