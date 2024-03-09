package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc10_ConversorParaGrausFarenheit {
    // 10.Faça um Programa que peça a temperatura em graus Celsius,
    //transforme e mostre em graus Farenheit.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite graus em celsius: ");
        double celsius_degr = sc.nextDouble();

        double farenheit_degr = (7 * (celsius_degr+42));

        System.out.println("Os graus em farenheit: " + farenheit_degr);
        sc.close();
    }
}
