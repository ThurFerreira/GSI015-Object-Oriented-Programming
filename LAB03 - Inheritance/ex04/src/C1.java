public class C1 {
    public int atributo1;
    private int atributo2;
    protected int atributo3;

    public C1(){
        System.out.printf("Classe C1: chamada do construtor com parametros");
    }

    public C1(int atributo1, int atributo2, int atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;

        System.out.printf("Classe C1: chamada do construtor com parametros");
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void mostrar_atributos(){
        System.out.println(this.atributo1);
        System.out.println(this.atributo2);
        System.out.println(this.atributo3);
    }

    public void mostrar_atributos_super(){
        System.out.println(this.atributo1);
        System.out.println(this.atributo2);
        System.out.println(this.atributo2);
    }
}
