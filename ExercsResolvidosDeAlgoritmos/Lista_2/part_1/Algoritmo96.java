package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("\ndigite um numero: ");
        numero = input.nextInt();

        if (numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("\ndivisivel por 3 e por 7");
        } else {
            System.out.println("\nnao eh divisivel por 3 e por 7");
        }
        System.out.println("\n");
        input.close();
    }
}
