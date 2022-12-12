public class Quadrado extends FormaBidimensional{

    public double lado;

    final String desc = "O quadrado é um quadrilátero regular congruente, ou seja, uma figura geométrica com quatro lados de mesmo comprimento e quatro ângulos retos.";

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

    public String getDesc() {
        return desc;
    }

    public void obterArea(){
        setArea(lado * lado);
    }

    public String showForma(){
        return "Quadrado de lado " + lado;
    }
}
