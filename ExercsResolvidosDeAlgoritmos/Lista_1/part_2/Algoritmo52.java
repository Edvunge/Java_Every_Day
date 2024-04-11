package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo52 {
    public static void main(String[] args) {
        // Entrar com o lado de um quadrado e imprimir:
        // perimetro:
        // area:
        // diagonal:
        Scanner input = new Scanner(System.in);
        double lado, perimetro, area, diagonal;

        System.out.println("digite o lado do quadrado: ");
        lado = input.nextDouble();

        perimetro = 4 * lado;
        area = lado * 2;
        diagonal = lado * Math.sqrt(2);

        System.out.println("perimetro: " + perimetro);
        System.out.println("area: " + area);
        System.out.println("diagonal: " + diagonal);
    }
}
