package AulasDoYoutube.broCode.oop.javaCourse2023.part00_exercs.exerc02_overloadedMethods;

public class CalculadoraApp {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somar(23, 34);
        calculadora.somar(1.2f, 2.3f, 4, 6);
    }
}
