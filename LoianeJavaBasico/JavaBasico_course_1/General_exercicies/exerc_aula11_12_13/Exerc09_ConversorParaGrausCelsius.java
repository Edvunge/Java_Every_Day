package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc09_ConversorParaGrausCelsius {
    // 9. Faça um Programa que peça a temperatura em graus Farenheit,
    //transforme e mostre a temperatura em graus Celsius.
    //o C = (5 * (F-32) / 9).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite graus em farenheit: ");
        double farenheit_degr = sc.nextDouble();

        double celsius_degr = (5 * (farenheit_degr-32) / 9);

        System.out.println("Os graus em celsius: " + celsius_degr);
        sc.close();
    }
}