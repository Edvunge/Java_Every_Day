package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.IntroducaoMetodos.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(24, 8);
        System.out.println(result);
    }
}
