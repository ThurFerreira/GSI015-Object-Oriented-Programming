import java.time.LocalDate;

public class Horistas extends Funcionario{
    private int valorPorHora;
    private int horasTrab;

    public Horistas() {
    }

    public Horistas(String nome, LocalDate dataNascimento, int valorPorHora, int horasTrab) {
        super(nome, dataNascimento, 0);
        this.valorPorHora = valorPorHora;
        this.horasTrab = horasTrab;
        calcSalarial();
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

    private void calcSalarial(){
        setSalario(valorPorHora * horasTrab);
    }

    public void pagamentos(){
        System.out.println("nome: " + getNome() + " | " + "salario: " + getSalario() + ".");
    }

}