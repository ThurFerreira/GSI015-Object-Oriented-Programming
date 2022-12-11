public class Quadrado extends FormaBidimensional{

    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        obterArea();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void obterArea(){
        setArea(lado * lado);
    }

    public String showForma(){
        return "Quadrado de lado " + lado;
    }
}
