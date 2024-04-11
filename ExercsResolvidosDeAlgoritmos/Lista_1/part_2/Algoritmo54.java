package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("Entre com base: ");
        a = input.nextInt();

        System.out.println("Entre com a altura do triangulo: ");
        b = input.nextInt();

        System.out.println("Area = " + (a * b)/2);
    }
}
