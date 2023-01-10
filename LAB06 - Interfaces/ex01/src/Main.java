import com.sun.security.jgss.GSSUtil;

public class Main{
    public static void main(String[] args) {
        Classificavel[] produtos = new Produto[3];
        Classificavel[] servicos = new Servico[3];
        Classificavel[] clientes = new Cliente[3];

        //produtos
        produtos[0] = new Produto(12113);
        produtos[1] = new Produto(12111);
        produtos[2] = new Produto(12112);

        //servicos
        servicos[0] = new Servico(12);
        servicos[1] = new Servico(8);
        servicos[2] = new Servico(1000000);

        //clientes
        clientes[0] = new Cliente("Wagner");
        clientes[1] = new Cliente("Carlos");
        clientes[2] = new Cliente("Maria");

        System.out.println("==| Vetores Desordenados |==");
        for (Classificavel e : produtos) {
            System.out.println(e.toString());
        }

        System.out.println();

        for (Classificavel e : servicos) {
            System.out.println(e.toString());
        }

        System.out.println();

        for (Classificavel e : clientes) {
            System.out.println(e.toString());
        }

        System.out.println();

        System.out.println("==| Vetores Ordenados |==");
        Classificador.ordena(produtos);
        Classificador.ordena(servicos);
        Classificador.ordena(clientes);

        for (Classificavel e : produtos) {
            System.out.println(e.toString());
        }

        System.out.println();

        for (Classificavel e : servicos) {
            System.out.println(e.toString());
        }

        System.out.println();

        for (Classificavel e : clientes) {
            System.out.println(e.toString());
        }

    }
}
