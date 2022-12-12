public class Esfera extends FormaTridimensional{
    public double raio;
    final String desc = "A esfera pode ser definida como \"uma sequência de pontos alinhados em todos os sentidos à mesma distância de um centro comum";

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

    public String getDesc() {
        return desc;
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
