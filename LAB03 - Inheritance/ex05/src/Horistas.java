public class Horistas extends Funcionario{
    private int valorPorHora;
    private int horasTrab;

    public Horistas() {
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    private void calcSalarial(int horasTrab, int valorPorHora){
        super.setSalario(valorPorHora * horasTrab);
    }

}