public class Cubo extends FormaTridimensional{

    public double lado;
    final String desc = "Um cubo ou hexaedro regular é um poliedro com 6 faces congruentes. Além disso, é um dos cinco sólidos platônicos";

    public Cubo(double lado) {
        this.lado = lado;
        obterArea();
        obterVolume();
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
        setArea(6*(lado * lado));
    }

    public void obterVolume(){
        setVolume(Math.pow(lado, 3));
    }

    public String showForma(){
        return "Cubo de lado " + lado;
    }
}
