package AulasDoYoutube.eXcript.javaOOP.construtores;

public class Janela {
    int largura, altura;
    boolean b;
    float f;
    double d;

    public Janela(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    Janela() {
        this(100, 190);
        System.out.println(largura);
        System.out.println("bool = " + b);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
    }

    void imprimir() {
        System.out.println("altura = " + altura + " a largura = "+ largura );
    }
    public static void main(String[] args) {
        //Janela j = new Janela(250, 255);
        Janela j = new Janela();
        j.imprimir();
    }
}
