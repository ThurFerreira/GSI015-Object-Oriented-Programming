public class FormaTridimensional extends Forma{
    public double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void obterArea(){

    }

    public void obterVolume(){

    }

    @Override
    public String toString() {
        return "FormaTridimensional: " + showForma() + " [" + "volume = " + volume + ']';
    }
}
