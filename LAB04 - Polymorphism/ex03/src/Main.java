import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Estudante[] estudantes = new Estudante[6];
        Estudante[] estudantesPosGraduacao = new Estudante[5];
        estudantes[0] = new EstudanteDoutorado("Bruno", "Rua Inverno", "Tecnologia", "Processamento de Imagens", "Carros Inteligentes");
        estudantes[1] = new EstudanteMestrado("Carla", "Rua Primavera", "Medicina", "Vacinas de RNA", "academico", "Anticorpos");
        estudantes[2] = new EstudanteGraduacao("Lucia", "Rua Maio", "Java is funny");
        estudantes[3] = new EstudanteDoutorado("Bruno", "Rua Inverno", "Tecnologia", "Processamento de Imagens", "Carros Inteligentes");
        estudantes[4] = new EstudanteMestrado("Ana", "Rua Primavera", "Medicina", "Vacinas de RNA", "academico", "Anticorpos");
        estudantes[5] = new EstudanteDoutorado("Guilherme", "Rua Inverno", "Tecnologia", "Processamento de Imagens", "Carros Inteligentes");

        Universidade universidade1 = new Universidade("UFU", LocalDate.now(), estudantes);
        Universidade universidade2 = new Universidade("UFU", LocalDate.now(), estudantesPosGraduacao);

        copiaAlunos(estudantes, estudantesPosGraduacao);

        System.out.println("| Universidade 1 |");
        System.out.println("");
        universidade1.mostraAlunos();
        System.out.println("");
        System.out.println(" | Universidade 2 | ");
        universidade2.mostraAlunosCompleto();

    }

    public static void copiaAlunos(Estudante[] vetOrigem, Estudante[] vetDestino){
        int i = 0;
        for (Estudante e: vetOrigem) {
            if(!(e instanceof EstudanteGraduacao)){
                vetDestino[i] = e;
                i++;
            }
        }
    }
}
