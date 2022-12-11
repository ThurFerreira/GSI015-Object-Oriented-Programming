import java.time.LocalDate;

public class Universidade {
    int doutorado = 0;
    int mestrado = 0;
    int graduacao = 0;
    String nome;
    LocalDate fundacao;

    Estudante[] estudantes;

    public Universidade(String nome, LocalDate fundacao, Estudante[] estudantes){
        this.nome = nome;
        this.fundacao = fundacao;
        this.estudantes = estudantes;
        contaEstudantes();
    }


    public int getDoutorado() {
        return doutorado;
    }

    public void setDoutorado(int doutorado) {
        this.doutorado = doutorado;
    }

    public int getMestrado() {
        return mestrado;
    }

    public void setMestrado(int mestrado) {
        this.mestrado = mestrado;
    }

    public int getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(int graduacao) {
        this.graduacao = graduacao;
    }


    private void contaEstudantes() {
        for (Estudante e : estudantes) {
            if (e instanceof EstudanteDoutorado) {
                setDoutorado(getDoutorado() + 1);

            } else if (e instanceof EstudanteGraduacao) {
                setGraduacao(getGraduacao() + 1);

            } else if (e instanceof EstudanteMestrado) {
                setMestrado(getMestrado() + 1);

            }
        }
    }

    public void mostraQtdEstudantes(){
        System.out.println("A universidade tem " + getDoutorado() + " estudantes de doutorado, " + getMestrado() + " estudantes de mestrado, e " + getGraduacao() + " estudantes de graduação");
    }

    public void mostraAlunos(){
        for (Estudante e: estudantes) {
            System.out.println(e.toString());
        }
    }

    public void mostraAlunosCompleto(){
        for (Estudante e: estudantes) {
            e.print();
        }
    }
}