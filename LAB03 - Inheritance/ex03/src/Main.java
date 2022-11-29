import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Figurinha figurinhaNormal = new Figurinha("messi",(LocalDate.of(1987, 6, 24)), 1.70, 72, "CA", "Argentina");
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra(figurinhaNormal,"lendaria", "dourada");

        figurinhaNormal.mostrarFigurinha();
        figurinhaExtra.mostrarFigurinhaExtra();

    }
}