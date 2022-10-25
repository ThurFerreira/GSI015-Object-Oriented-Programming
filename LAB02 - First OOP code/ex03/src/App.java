import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        int size = 3;
        Figurinha3 figurinhas[] = new Figurinha3[size];

        for (int i = 0; i < figurinhas.length; i++) {
            figurinhas[i] = new Figurinha3();
        }

        String nome;
        int ano, mes, dia;
        double altura;
        double peso;
        String posicao;
        String pais;
        
        for (int i = 0; i < size; i++){
    
            System.out.println("==== Digites as informações do " + (i+1) + " jogador ====");

            System.out.printf("Digite o nome do jogador %d:\n", i+1);
            nome = in.next();
            figurinhas[i].setNome(nome);

            System.out.printf("Digite o dia de nascimento do jogador %d:\n", i+1);
            dia = in.nextInt();
            System.out.printf("Digite o mes de nascimento do jogador %d:\n", i+1);
            mes = in.nextInt();
            System.out.printf("Digite o ano do jogador %d:\n", i+1);
            ano = in.nextInt();
            figurinhas[i].setDataNascimento(LocalDate.of(ano,mes,dia));

            System.out.printf("Digite a altura do jogador %d:\n", i+1);
            altura = in.nextDouble();
            figurinhas[i].setAltura(altura);

            System.out.printf("Digite o peso do jogador %d:\n", i+1);
            peso = in.nextDouble();
            figurinhas[i].setPeso(peso);

            System.out.printf("Digite a posição do jogador %d:\n", i+1);
            posicao = in.next();
            figurinhas[i].setPosicao(posicao);

            System.out.printf("Digite o país do jogador %d:\n", i+1);
            pais = in.next();
            figurinhas[i].setPais(pais);

            System.out.println("");
        }

        in.close();

        for(int i = 0; i < size; i++){
            figurinhas[i].show();
        }
    }
}
