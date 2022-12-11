public class Circulo extends FormaBidimensional{

    public double raio;
    public Circulo(double raio) {
        this.raio = raio;
        obterArea();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void obterArea(){
        setArea(Math.PI * Math.pow(raio, 2));
    }

    public String showForma(){
        return "Circulo de raio " + raio;
    }
}
