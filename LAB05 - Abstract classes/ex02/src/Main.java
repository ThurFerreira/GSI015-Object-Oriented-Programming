import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int passLimit = 0;
        ContaCorrente Conta1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do limite da conta");
        passLimit = in.nextInt();
        in.close();

        if (passLimit == 0) {
            Conta1 = new ContaComum(10, 123, 213);
        } else {
            Conta1 = new ContaEspecial(10, 123, 321, passLimit);
        }
    }
}