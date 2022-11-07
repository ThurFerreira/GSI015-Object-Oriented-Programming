import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Figurinha Messi = new Figurinha();
        Figurinha CristianoRonaldo = new Figurinha();
        Figurinha Ronaldo = new Figurinha();
        
        Ronaldo.nome = "Ronaldo";
        Ronaldo.dataNascimento = LocalDate.of(1976, 9, 22);
        Ronaldo.altura = 1.87;
        Ronaldo.peso = 85;
        Ronaldo.posicao = "CA";
        Ronaldo.pais = "Brasil";

        Messi.nome = "Messi";
        Messi.dataNascimento = LocalDate.of(1987, 6, 24);
        Messi.altura = 1.70;
        Messi.peso = 72;
        Messi.posicao = "CA";
        Messi.pais = "Argentina";
        
        CristianoRonaldo.nome = "CristianoRonaldo";
        CristianoRonaldo.dataNascimento = LocalDate.of(1985, 5, 2);
        CristianoRonaldo.altura = 1.87;
        CristianoRonaldo.peso = 79;
        CristianoRonaldo.posicao = "CA";
        CristianoRonaldo.pais = "Portugal";

       // System.out.println("Ronaldo Fenômeno");
        System.out.println(Ronaldo.nome);
        System.out.println(Ronaldo.dataNascimento);
        System.out.println(Ronaldo.altura);
        System.out.println(Ronaldo.peso);
        System.out.println(Ronaldo.posicao);
        System.out.println(Ronaldo.pais);

        System.out.println("");

        //System.out.println("Messi");
        System.out.println(Messi.nome);
        System.out.println(Messi.dataNascimento);
        System.out.println(Messi.altura);
        System.out.println(Messi.peso);
        System.out.println(Messi.posicao);
        System.out.println(Messi.pais);

        System.out.println("");

        //System.out.println("Cristiano Ronaldo");
        System.out.println(CristianoRonaldo.nome);
        System.out.println(CristianoRonaldo.dataNascimento);
        System.out.println(CristianoRonaldo.altura);
        System.out.println(CristianoRonaldo.peso);
        System.out.println(CristianoRonaldo.posicao);
        System.out.println(CristianoRonaldo.pais);
    }
}
