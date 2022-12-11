public class Cubo extends FormaTridimensional{

    public double lado;

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
