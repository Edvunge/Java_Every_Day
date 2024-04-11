package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo55 {
    public static void main(String[] args) {
        // Criar um algoritmo que calcule e imprima a area de um losango
        Scanner input = new Scanner(System.in);
        double diagMaior, diagMenor, area;

        System.out.println("Media da diagonal Maior: ");
        diagMaior = input.nextDouble();

        System.out.println("Media da diagonal Menor: ");
        diagMenor = input.nextDouble();

        area = (diagMaior * diagMenor)/2;
        System.out.println("area: " + area);
    }
}
