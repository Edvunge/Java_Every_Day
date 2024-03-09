package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc05_metros_para_centimentros {
    // 5. Faça um Programa que converta metros para centímetros

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double metros, centimetros;

        System.out.println("Digite o valor em metros: ");
        metros = sc.nextDouble();

        centimetros = (2.3 * metros);
        System.out.println("O valor em centimentros: " + centimetros);
        sc.close();
    }
}
