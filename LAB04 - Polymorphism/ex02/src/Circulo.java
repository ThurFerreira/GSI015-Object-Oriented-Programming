public class Circulo extends FormaBidimensional{

    public double raio;
    final String desc = "um círculo é o conjunto dos pontos internos de uma circunferência. Por vezes, também se chama círculo o conjunto de pontos cuja distância ao centro é menor ou igual a um dado valor (ao qual chamamos raio)";
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

    public String getDesc(){
        return desc;
    }

    public void obterArea(){
        setArea(Math.PI * Math.pow(raio, 2));
    }

    public String showForma(){
        return "Circulo de raio " + raio;
    }
}
