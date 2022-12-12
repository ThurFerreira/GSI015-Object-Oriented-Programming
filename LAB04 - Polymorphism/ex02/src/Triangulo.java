public class Triangulo extends FormaBidimensional{

    public double base;
    public double altura;
    final String desc = "é a figura geométrica que ocupa o espaço interno limitado por três segmentos de reta que concorrem, dois a dois, em três pontos diferentes formando três lados e três ângulos internos que somam 180";

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

    public String getDesc() {
        return desc;
    }

    public void obterArea(){
        setArea(base * altura);
    }

    public String showForma(){
        return "Triangulo de base " + base + " e altrua " + altura;
    }
}
