public class Tetraedro extends FormaTridimensional{

    public double lado;
    final String desc = "Na geometria, um tetraedro, também conhecido como uma pirâmide triangular, é um poliedro composto por quatro faces triangulares, três delas encontrando-se em cada vértice";
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

    public String getDesc() {
        return desc;
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
