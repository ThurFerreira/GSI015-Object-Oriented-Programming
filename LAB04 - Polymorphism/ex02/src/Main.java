import java.util.Formattable;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(3);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(3, 3);
        formas[3] = new Esfera(3);
        formas[4] = new Cubo(3);
        formas[5] = new Tetraedro(3, 3);

        showDimensao(formas);
    }

    public static void showDimensao(Forma[] formas){

        for (Forma e: formas) {
            if(e instanceof FormaBidimensional){
                System.out.println(e.toString());
            }else if(e instanceof FormaTridimensional){
                System.out.println(e.toString());
            }
        }
    }
}