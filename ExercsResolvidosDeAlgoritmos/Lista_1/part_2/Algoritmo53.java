package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo53 {
    public static void main(String[] args) {
        // Entrar com os lados a, b, c de um paralelepido. Calcular e imprimir a diagonal.
        Scanner input = new Scanner(System.in);
        double a, b, c, diagonal;

        System.out.println("entre com a base: ");
        a = input.nextDouble();

        System.out.println("entre com a altura: ");
        b = input.nextDouble();

        System.out.println("entre com a profundidade: ");
        c = input.nextDouble();

        diagonal = Math.sqrt(a*2 + b*2 + c*2);
        System.out.println("diagonal: " + diagonal);
    }
}
