package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(24, 8);
        System.out.println(result);
    }
}
