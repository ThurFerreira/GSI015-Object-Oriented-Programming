public class C2 extends C1 {
    public int atributo4;
    private int atributo5;
    protected int atributo6;

    public C2() {
        System.out.printf("Classe C2: chamada do construtor sem parametros");
    }

    public C2(int atributo4, int atributo5, int atributo6) {
        this.atributo4 = atributo4;
        this.atributo5 = atributo5;
        this.atributo6 = atributo6;

        System.out.printf("Classe C2: chamada do construtor com parametros");
    }

    public int getAtributo5() {
        return atributo5;
    }

    public void mostrar_atributos() {
        System.out.println(this.atributo1);
        System.out.println(this.getAtributo2());
        System.out.println(this.atributo3);
        System.out.println(this.atributo4);
        System.out.println(this.atributo5);
        System.out.println(this.atributo6);
    }

    public void mostrar_atributos_super() {
        System.out.println(super.atributo1);
        System.out.println(super.getAtributo2());
        System.out.println(super.atributo3);
        System.out.println(this.atributo4);
        System.out.println(this.atributo5);
        System.out.println(this.atributo6);

    }
}
