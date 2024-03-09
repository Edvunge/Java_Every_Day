package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc06_areaDoCirculo {
    // 6. Faça um Programa que peça o raio de um círculo, calcule e mostre
    //sua área.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio de um circulo: ");
        double raioDoCirculo = sc.nextDouble();

        // Area = PI * raio ao quadrd
        double PI = 3.1415;

        double areaDoCirculo = (PI * (raioDoCirculo * raioDoCirculo));

        System.out.println("O valor da area do circulo: " + areaDoCirculo);
        sc.close();
    }
}
