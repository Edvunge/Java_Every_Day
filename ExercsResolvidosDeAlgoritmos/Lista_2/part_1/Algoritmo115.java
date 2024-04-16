package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        System.out.println("\nDigite o valor de a: ");
        a = input.nextDouble();

        System.out.println("\nDigite o valor de b: ");
        b = input.nextDouble();

        if (a > b) {
            System.out.println("\n" + Math.sqrt(a) + "\n" + b*2 );
        } else {
            if (b > a) {
                System.out.println("\n" + Math.sqrt(b) + "\n" + a*2 );
            } else {
                System.out.println("\nnumeros iguais");
            }
        }
        System.out.println("\n");
        input.close();
    }
}
