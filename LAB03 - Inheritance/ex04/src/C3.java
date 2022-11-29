public class C3 extends C2{
    public int atributo7;
    private int atributo8;
    protected int atributo9;

    public C3(){
        System.out.println("Classe C3: chamada do construtor sem parametros");
    }

    public C3(int atributo1, int atributo2, int atributo3, int atributo4, int atributo5, int atributo6,int atributo7, int atributo8, int atributo9){
        super(atributo4, atributo5, atributo6);
        this.atributo7 = atributo7;
        this.atributo8 = atributo8;
        this.atributo9 = atributo9;

        System.out.printf("Classe C3: chamada do construtor com parametros");
    }

    public void mostrar_atributos(){
        System.out.println(this.atributo1);
        System.out.println(this.getAtributo2());
        System.out.println(this.atributo3);
        System.out.println(this.atributo4);
        System.out.println(this.getAtributo5());
        System.out.println(this.atributo6);
        System.out.println(this.atributo7);
        System.out.println(this.atributo8);
        System.out.println(this.atributo9);
    }
    public void mostrar_atributos_super() {
        System.out.println(super.atributo1);
        System.out.println(super.getAtributo2());
        System.out.println(super.atributo3);
        System.out.println(super.atributo4);
        System.out.println(super.getAtributo5());
        System.out.println(super.atributo6);
        System.out.println(this.atributo7);
        System.out.println(this.atributo8);
        System.out.println(this.atributo9);

    }



}
