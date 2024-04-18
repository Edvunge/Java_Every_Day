package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo123 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.println("\nDigite 1 lado: ");
        a = input.nextDouble();

        System.out.println("\nDigite 2 lado: ");
        b = input.nextDouble();

        System.out.println("\nDigite 3 lado: ");
        c = input.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && a == c) {
                System.out.println("\nTriangulo equilatero");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("\nTriangulo Isosceles");
                } else {
                    System.out.println("\nTringulao escaleno");
                }
            }
        } else {
            System.out.println("\nAs medidas formam um triangulo");
        }
        System.out.println("\n");
    }
}
