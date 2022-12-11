public class Triangulo extends FormaBidimensional{

    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        obterArea();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void obterArea(){
        setArea(base * altura);
    }

    public String showForma(){
        return "Triangulo de base " + base + " e altrua " + altura;
    }
}
