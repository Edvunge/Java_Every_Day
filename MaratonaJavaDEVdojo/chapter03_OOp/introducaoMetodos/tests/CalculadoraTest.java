package MaratonaJavaDEVdojo.chapter03_OOp.introducaoMetodos.tests;

import MaratonaJavaDEVdojo.chapter03_OOp.introducaoMetodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(6, 2);
        calculadora.divideDoisNumeros(20, 5);
    }
}
