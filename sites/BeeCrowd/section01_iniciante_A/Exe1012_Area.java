package sites.BeeCrowd.section01_iniciante_A;

import java.util.Scanner;

public class Exe1012_Area {
    /*
        Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
        Em seguida, calcule e mostre:

        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("Digite 3 valores em double: ");
        double value_A = input.nextDouble();
        double value_B = input.nextDouble();
        double value_C = input.nextDouble();

        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // area = base*altura/2
        double areaTriang = ((value_A*value_C)/2);
        System.out.printf("\nA AREA DO TRIANGULO RETANGULO EH: %.2f",areaTriang);

        // b) a área do círculo de raio C. (pi = 3.14159)
        double areaDoCirculo = PI * (value_C * value_C);
        System.out.printf("\nA AREA DO CIRCULO EH: %.2f",areaDoCirculo);

        // c) a área do trapézio que tem A e B por bases e C por altura.
        double areaDoTrapezio = ((value_A + value_B) * value_C/2);
        System.out.printf("\nA AREA DO TRAPEZIO EH: %.2f",areaDoTrapezio);

        // d) a área do quadrado que tem lado B.
        double areaDoQuadrado = (value_B * value_B);
        System.out.printf("\nA AREA DO QUADRADO EH: %.2f",areaDoQuadrado);

        // e) a área do retângulo que tem lados A e B.
        double areaDoRetangulo = value_A * value_B;
        System.out.printf("\nA AREA DO RETANGULO EH: %.2f",areaDoRetangulo);
    }
}
