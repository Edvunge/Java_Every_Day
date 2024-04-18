package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.println("\ndigite 1 lado: ");
        a = input.nextDouble();

        System.out.println("\ndigite 2 lado: ");
        b = input.nextDouble();

        System.out.println("\ndigite 3 lado: ");
        c = input.nextDouble();

        if ( a < b + c && b < a + c && c < a + b ) {
            System.out.println("\nPodem ser lados de um triangulo");
        } else {
            System.out.println("\nNao podem ser lidos de um triangulos");
        }
        System.out.println("\n");
        input.close();
    }
}
