public class UsaBanco{

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaComum(400, 33555, 123);
        ContaCorrente conta2 = new ContaEspecial(2131, 01247, 123, 15000);

        System.out.println("Modificando a Conta 1:");
        System.out.println("Conta 1 - Saldo atual: " + conta1.getSaldo(123));
        conta1.debitaValor(30, 123);
        System.out.println("Debitado 30 reais da conta 1, saldo atual: " + conta1.getSaldo(123));
        conta1.creditaValor(123,99999);
        System.out.println("Adicionado 99999 reais a conta 1, saldo atual: " + conta1.getSaldo(123));

        System.out.println();

        System.out.println("Modificando a Conta 2:");
        System.out.println("Conta 1- Saldo atual: " + conta2.getSaldo(123));
        conta1.debitaValor(1000, 123);
        System.out.println("Debitado 1000 reais da conta 2, saldo atual: " + conta2.getSaldo(123));
        conta1.creditaValor(123,2389);
        System.out.println("Adicionado 2389 reais a conta 2, saldo atual: " + conta2.getSaldo(123));

    }
}
