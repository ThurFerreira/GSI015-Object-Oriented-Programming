import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.swing.JOptionPane;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

        sc.close();
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];

        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }

        sc.close();
    }

    public static void ex03() {
        
        Scanner in = new Scanner(System.in);
        int vet[] = new int[6];

        System.out.println("<< Listando um vetor em ordem inversa >>");

        for(int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:", i+1);
            vet[i] = in.nextInt();
        }

        System.out.printf("A ordem inversa dos números é: ");

        for(int i = 5; i >= 0; i--){
            System.out.printf("%d ", vet[i]);
        }

        in.close();
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int verifica, i = 0;

        System.out.println("<< Listando um vetor de números pares>>");

        while(i < 6){
            System.out.printf("Entre com o número %d:\n",i+1);
            verifica = sc.nextInt();

            if((verifica % 2) == 0){
                vet[i] = verifica;
                i++;

            }else{
                System.out.println("Erro: Valor inválido");
                JOptionPane.showMessageDialog(null, "Erro: Valor inválido");
            }
            
        }

        sc.close();

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex05(){

        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        double media = 0;
        int maior = 0,  menor = 0;
        int i;

        System.out.println("<< 5 valores >>");

        for (i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();

            //somatorio da média
            media += vet[i];
        }

        sc.close();

        //retorna menor valor
        for(i = 0; i < vet.length; i++){
            if (vet[i] < menor){
                menor  = vet[i];
            }
        }

        //retorna maior valor
        for(i = 0; i < vet.length; i++){
            if (vet[i] > maior){
                maior  = vet[i];
            }
        }

        media = media/vet.length;

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.println("");

        System.out.printf("O maior valor é: %d\n", maior);
        System.out.printf("O menor valor é: %d\n", menor);
        System.out.printf(Locale.ITALY,"A média é: %.1f\n", media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        double media = 0;
        int maior = 0,  menor = 0;
        int i, indice_menor = 0, indice_maior = 0;

        System.out.println("<< 5 valores >>");

        for (i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();

            //somatorio da média
            media += vet[i];
        }

        sc.close();

        //retorna menor valor
        for(i = 0; i < vet.length; i++){

            if (vet[i] <= menor){
                menor  = vet[i];
                indice_menor = i;
            }
        }

        //retorna maior valor
        for(i = 0; i < vet.length; i++){

            if (vet[i] > maior){
                maior  = vet[i];
                indice_maior = i;
            }
        }

        media = media/vet.length;

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.println("");

        System.out.printf("O maior valor é: %d, localizado na posição %d do vetor\n", maior, indice_maior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n", menor, indice_menor);
        System.out.printf(Locale.ITALY,"A média é: %.1f\n", media);
    
    }

    public static void ex07(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;

        System.out.println("<< Normalizando as notas >>");

        for (i = 0; i < 5; i++){

            System.out.printf("Entre com a nota do aluno %d:\n",i+1);
            vet[i] = sc.nextInt();

        }

        System.out.println("Notas normalizadas");

        for(i = 0; i < vet.length; i++){

            if (vet[i] < 50)
            System.out.printf("Nota do aluno %d é: %d\n", i, vet[i]*2);
            else
            System.out.printf("Nota do aluno %d é: %d\n", i, 100);

        }
    }

    public static void ex08(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;
        double media = 0, desvio_padrao = 0;

        System.out.println("<< Média e desvio-padrao >>");

        for (i = 0; i < vet.length; i++){

            System.out.printf("Digite o valor %d:\n",i+1);
            vet[i] = sc.nextInt();

            media = media + vet[i];
        }
            
            media = media/vet.length;
            
            for(i = 0; i < vet.length; i++){

               desvio_padrao += Math.pow((vet[i] - media), 2);
            }

            desvio_padrao = Math.sqrt(desvio_padrao/((vet.length)-1));

            System.out.printf("A média é %.0f e o desvio-padrão é %f\n", media, desvio_padrao);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int i;
        int qtd_alunos;
        double media = 0;

        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");

        do{
            System.out.println("Entre com o número de alunos: ");
            qtd_alunos = sc.nextInt();

            if(qtd_alunos > 100){
                System.out.println("Erro! O número máximo de alunos permitido é 100.");
            }

        }while(qtd_alunos > 100);

        int[] vet = new int[qtd_alunos];

        for (i = 0; i < vet.length; i++){

            System.out.printf("Digite a nota do aluno %d: \n",i+1);
            vet[i] = sc.nextInt();

            media += vet[i];
        }

        media = media/vet.length;

        System.out.println("Relatório de Notas");

        for(i = 0; i < vet.length; i++){
            System.out.printf("A nota do aluno %d é: \n",  vet[i]);
        }

        System.out.printf("A média da turma é: %.1f\n", media);
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[3];
        int B[] = new int[3];
        int C[] = new int[3];

        System.out.println("<< Subtração de vetroes >>");

        for(int i = 0; i < A.length; i++){
            System.out.printf("Digite o valor %d do vetor A: \n", i+1);
            A[i] = sc.nextInt();
        }

        System.out.println("");

        for(int i = 0; i < B.length; i++){
            System.out.printf("Digite o valor %d do vetor B: \n", i+1);
            B[i] = sc.nextInt();
        }

        for(int i = 0; i < A.length; i++){
            C[i] = A[i] - B[i];
        }

        System.out.printf("O vetor C, definido como C = A-B é (");

        for(int i = 0; i < C.length; i++){

            if(i != ((C.length)-1))
            System.out.printf("%d ", C[i]);
            else
                System.out.printf("%d)\n", C[i]);            
        }
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int v1[] = new int[5];
        int v2[] = new int[5];
        int i = 0, valor;

        Arrays.fill(v1, 0);

        System.out.println("<< Pares e ímpares >>");

        for(i = 0; i < vet.length; i++){

            System.out.printf("Digite o valor %d: \n", i+1);
            valor = sc.nextInt();

            if((valor % 2) == 0)    //pares = v1
                v1[i] = valor;
            else                    //impares = v2
                v2[i] = valor;
        }

        System.out.printf("\nÍmpares: ");

        for(i = 0; i < vet.length; i++){

            if(v2[i] != 0)
            System.out.printf("%d ", v2[i]);
        }

        System.out.printf("\nPares: ");

        for(i = 0; i < vet.length; i++){

            if(v1[i] != 0)
            System.out.printf("%d ", v1[i]);
        }

        System.out.println("");

    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        double verde,azul,amarela,vermelha;
        double total;
        double maior;

        System.out.println("<< Probabilidades >>");

        System.out.println("\n Digite a quantidade de bolinhas");
        
        System.out.println("Verde: ");
        verde = sc.nextDouble();

        System.out.println("Azul: ");
        azul = sc.nextDouble();

        System.out.println("Amarela: ");
        amarela = sc.nextDouble();

        System.out.println("Vermelha: ");
        vermelha = sc.nextDouble();

        total = verde + azul +  amarela + vermelha;

        verde = (verde*100)/total;
        azul = (azul*100)/total;
        amarela = (amarela*100)/total;
        vermelha = (vermelha*100)/total;

        maior = Math.max(verde, azul);
        maior = Math.max(maior, amarela);
        maior = Math.max(maior, vermelha);

        System.out.println("Probabilidades");

        if(maior == verde)
            System.out.printf("Verde: %.1f%% << Maior probabilidade\n", verde);
        else
            System.out.printf("Verde: %.1f%%\n", verde);

        if(maior == azul)
            System.out.printf("Verde: %.1f%% << Maior probabilidade\n", azul);
        else
            System.out.printf("Azul: %.1f%%\n", azul);

        if(maior == amarela)
            System.out.printf("Amarela: %.1f%% << Maior probabilidade\n", amarela);
        else
            System.out.printf("Amarela: %.1f%%\n", amarela);

        if(maior == vermelha)
            System.out.printf("Vermelha: %.1f%% << Maior probabilidade\n", vermelha);
        else
            System.out.printf("Vermelha: %.1f%%\n", vermelha);

    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[5];
        int i, valor;

        System.out.println("<< Zerando negativos >>");

        for(i = 0; i < vet.length; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            valor = sc.nextInt();

            if(valor < 0)
                vet[i] = 0;
            else
                vet[i] = valor;
        }

        System.out.printf("Zerando os negativos, obtém-se:");

        for(i = 0; i < vet.length; i++){
            System.out.printf(" %d", vet[i]);
        }

        System.out.println("");


    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int i, j = 0;
        char classe;
        int qtd_cadastros;
        System.out.println("<< Universidade X >>");
        System.out.println("Quantos alunos serão cadastrados: \n");
        qtd_cadastros = sc.nextInt();
        sc.close();
     
        double aluno[][] = new double[qtd_cadastros][3];

        if(qtd_cadastros <= 10000){

                for(i = 0; i < qtd_cadastros; i++){

                        System.out.println("Entre com o numero do aluno: ");
                        aluno[i][j] = sc.nextInt();

                        System.out.println("Entre com a classe social do aluno: ");
                        classe = sc.next().charAt(0);
                        aluno[i][j+1] = (double) classe;

                        System.out.println("Entre com o CRA do aluno: ");
                        aluno[i][j+2] = sc.nextInt();
                }

        }else{
            System.out.println("Erro!");
        }

            System.out.println(("==== Alunos Cadastrados ===="));

            for(i = 0; i < qtd_cadastros; i++){
                System.out.printf("Numero %.0f Classe Social: %c CRA %.2f\n", aluno[i][j], (char) aluno[i][j+1], aluno[i][j+2]);
            }
            
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] vetAux = new int[8];
        
       
        int buffer, ant=0;
        int i, j=0, indice = 0;

        System.out.println("<< Valores iguais >>");

        for (i = 0; i < 8; i++){

            System.out.printf("Entre com o numero %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        Arrays.sort(vet);

        for(i = 0; i < vet.length; i++){
            j = 0;
            buffer = vet[i];
            
            //percorre o vetor buscando valores iguais
            for(int k = 0; k < vet.length; k++ ){
                
                if(buffer == vet[k]){
                    j++;
                }
                
            }

            //atribui os valores repetidoa a um vetor auxiliar
            if(j != 1 && buffer != ant){

                vetAux[indice] = buffer;
                indice++;    
            }

            ant = buffer;
        }

        System.out.printf("Valores repetidos: ");

        for(i = 0; i < indice; i++){

                System.out.printf("%d ", vetAux[i]);
        }

        System.out.println("");
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int[] vetAux = new int[8];
        int[] qtdRepetidos = new int[8];
       
        int buffer, ant=0;
        int i, j=0, indice = 0;

        System.out.println("<< Valores iguais >>");

        for (i = 0; i < 8; i++){

            System.out.printf("Entre com o numero %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        Arrays.sort(vet);

        for(i = 0; i < vet.length; i++){
            j = 0;
            buffer = vet[i];
            
            //percorre o vetor buscando valores iguais
            for(int k = 0; k < vet.length; k++ ){
                
                if(buffer == vet[k]){
                    j++;
                }
                
            }

            //atribui os valores repetidoa a um vetor auxiliar
            if(j != 1 && buffer != ant){

                vetAux[indice] = buffer;
                qtdRepetidos[indice] = j;
                indice++;    
            }

            ant = buffer;
        }

        System.out.printf("Valores repetidos: \n");

        for(i = 0; i < indice; i++){

                System.out.printf("%d aparece %d vezes", vetAux[i], qtdRepetidos[i]);
                System.out.println("");
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        // ex07();
        // ex08();
        // ex09();
        // ex10();
        // ex11();
        // ex12();
        // ex13();
        // ex14();
        // ex15();
        // ex16();
    }

}
