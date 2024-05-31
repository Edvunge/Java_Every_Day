package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc07_areaDoQuadrd {
    // 7. Faça um Programa que calcule a área de um quadrado, em seguida
    //mostre o dobro desta área para o usuário.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite de um lado: ");
        double lado = sc.nextDouble();

        double areaDoQuadrad = (lado * lado);
        areaDoQuadrad = areaDoQuadrad * areaDoQuadrad;

        System.out.println("O valor do area do lado: " + areaDoQuadrad);
        sc.close();
    }
}