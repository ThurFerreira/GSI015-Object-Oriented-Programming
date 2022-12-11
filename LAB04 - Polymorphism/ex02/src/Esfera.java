public class Esfera extends FormaTridimensional{
    public double raio;

    public Esfera(double raio) {
        this.raio = raio;
        obterArea();
        obterVolume();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void obterArea(){
        super.setArea(4*(Math.PI * (raio * raio)));
    }

    public void obterVolume(){
        setVolume((4/3) * Math.PI * Math.pow(raio, 3));
    }

    public String showForma(){
        return "Esfera de raio " + raio;
    }
}
