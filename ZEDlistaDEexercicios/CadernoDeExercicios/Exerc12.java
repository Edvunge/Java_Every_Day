package ZEDlistaDEexercicios.CadernoDeExercicios;

import java.util.Scanner;

public class Exerc12 {
    //  12. Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
    //  convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5,
    //  na qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Digite o valor em graus celsius: ");
        celsius = input.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("O valor do fahrenheit: %.2f",fahrenheit);
        input.close();
    }
}
