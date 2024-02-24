package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.B_IntroducaoMetodos.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.B_IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste5 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
