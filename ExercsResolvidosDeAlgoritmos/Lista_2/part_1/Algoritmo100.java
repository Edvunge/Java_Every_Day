package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, c;

        System.out.println("\ndigite um numero de 4 algorismos: ");
        numero = input.nextInt();

        c = numero / 100;

        if (numero % 2 == 0) {
            System.out.println("\no numero e multiplo de 4: " + c);
        } else {
            System.out.println("\no numero nao e multiplo de 4:" + c);
        }
        System.out.println("\n");
        input.close();
    }
}
