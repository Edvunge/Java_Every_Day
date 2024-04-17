package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, maior, intermediario, menor;

        System.out.println("\nDigite 1 numero: ");
        a = in.nextDouble();

        System.out.println("\nDigite 2 numero: ");
        b = in.nextDouble();

        System.out.println("\nDigite 3 numero: ");
        c = in.nextDouble();

        if (a > b) {
            if (c > a) {
                maior = c;
                intermediario = a;
                menor = b;
            } else {
                if (c > b) {
                    maior = a;
                    intermediario = c;
                    menor = b;
                } else {
                    maior = a;
                    intermediario = b;
                    menor = c;
                }
            }
        } else {
            if (c > a) {
                maior = c;
                intermediario = b;
                menor = a;
            } else {
                if (c > a) {
                    maior = b;
                    intermediario = c;
                    menor = a;
                } else {
                    maior = b;
                    intermediario = a;
                    menor = c;
                }
            }
        }
        System.out.println("\nmaior: " + maior);
        System.out.println("\nintermediario: " + intermediario);
        System.out.println("\nmenor: " + menor);
        System.out.println("\n");
    }
}
