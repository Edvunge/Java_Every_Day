package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5, maior, menor;

        System.out.println("\nDigite 1 numero: ");
        n1 = input.nextInt();

        System.out.println("\nDigite 1 numero: ");
        n2 = input.nextInt();

        System.out.println("\nDigite 1 numero: ");
        n3 = input.nextInt();

        System.out.println("\nDigite 1 numero: ");
        n4 = input.nextInt();

        System.out.println("\nDigite 1 numero: ");
        n5 = input.nextInt();

        if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n2 != n3 && n2 != n4 && n2 != n5 && n3 != n4 && n3 != n5 && n4 != n5) {
            if (n1 > n2) {
                maior = n1;
                menor = n2;
            } else {
                maior = n2;
                menor = n1;
            } if (n3 > maior) {
                maior = n3;
            } else {
                if (n3 < maior) {
                    menor = n3;
                }
            } if (n4 > maior) {
                maior = n4;
            } else {
                if (n4 < menor) {
                    menor = n4;
                }
            } if (n5 > maior) {
                maior = n5;
            } else {
                if (n5 < menor) {
                    menor = n5;
                }
            }
            System.out.println("\nmaior = " + maior);
            System.out.println("\nmenor = " + menor);
        } else {
            System.out.println("\nOs valores devem ser diferentes ");
        }
        System.out.println("\n");
    }
}
