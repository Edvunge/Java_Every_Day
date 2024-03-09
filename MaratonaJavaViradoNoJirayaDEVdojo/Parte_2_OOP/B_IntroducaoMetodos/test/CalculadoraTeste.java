package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtrairDoisNumeros();
    }
}
