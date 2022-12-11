public class Tetraedro extends FormaTridimensional{

    public double lado;
    public double altura;

    public Tetraedro(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
        obterArea();
        obterVolume();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void obterArea(){
        setArea((lado * lado) * Math.sqrt(3));
    }

    public void obterVolume(){
        setVolume((1/3) * (lado * altura) * altura);
    }

    public String showForma(){
        return "Tetraedro de lado " + lado + " e altura " + altura;
    }
}
