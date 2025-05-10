package AulasDoYoutube.broCode.oop.javaCourse2023.part00_exercs.exerc02_overloadedMethods;

public class ImpressoraApp {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        impressora.imprimir(23);
        impressora.imprimir("alguma coisa sem sentido");
        impressora.imprimir(2.1);
    }
}
