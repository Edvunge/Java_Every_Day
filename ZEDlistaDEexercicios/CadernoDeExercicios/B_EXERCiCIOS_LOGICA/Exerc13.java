package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc13 {
    //  13. Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente
    //  convertida em graus Celsius. A fórmula de conversão é C = (F – 32) * ( 5 / 9), na
    //  qual F é a temperatura em Fahrenheit e C é a temperatura em Celcius.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Digite o valor em graus fahrenheit: ");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * (5 / 9);

        System.out.printf("O valor do celsius: %.2f",celsius);
        input.close();
    }
}
