import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinha figurinhaNormal = new Figurinha("messi",(LocalDate.of(1987, 6, 24)), 1.70, 72, "CA", "Argentina");
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("cr7", (LocalDate.of(1987, 6, 24)),1.70, 72, "CA", "Portugal", "lendaria", "dourada");

        figurinhaNormal.mostrarFigurinha();
        figurinhaExtra.mostrarFigurinhaExtra();

    }
}