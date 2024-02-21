package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.IntroducaoMetodos.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtrairDoisNumeros();
    }
}
