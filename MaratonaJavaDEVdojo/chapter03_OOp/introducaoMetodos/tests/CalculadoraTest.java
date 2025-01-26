package MaratonaJavaDEVdojo.chapter03_OOp.introducaoMetodos.tests;

import MaratonaJavaDEVdojo.chapter03_OOp.introducaoMetodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(6, 2);
        System.out.println("divisao de dois numeros");
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println("imprimindo dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("Continuando exec");
    }
}
