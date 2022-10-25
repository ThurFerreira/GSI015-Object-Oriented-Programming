import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Figurinha2 Messi = new Figurinha2();
        Figurinha2 CristianoRonaldo = new Figurinha2();
        Figurinha2 Ronaldo = new Figurinha2();
        
        Messi.setNome("Messi");
        Messi.setDataNascimento(LocalDate.of(1987, 6, 24));
        Messi.setAltura(1.70);
        Messi.setPeso(72);
        Messi.setPosicao("CA");
        Messi.setPais("Argentina");

        CristianoRonaldo.setNome("Cristiano Ronaldo");
        CristianoRonaldo.setDataNascimento(LocalDate.of(1987, 6, 24));
        CristianoRonaldo.setAltura(1.70);
        CristianoRonaldo.setPeso(72);
        CristianoRonaldo.setPosicao("CA");
        CristianoRonaldo.setPais("Portugal");

        Ronaldo.setNome("Ronaldo");
        Ronaldo.setDataNascimento(LocalDate.of(1976, 9, 22));
        Ronaldo.setAltura(1.87);
        Ronaldo.setPeso(85);
        Ronaldo.setPosicao("CA");
        Ronaldo.setPais("Brasil");

        Messi.show();
        CristianoRonaldo.show();
        Ronaldo.show();
    }
}
