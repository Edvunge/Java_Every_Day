package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, maior, lados;

        System.out.println("\nDigite 1 lado: ");
        a = input.nextDouble();

        System.out.println("\nDigite 2 lado: ");
        b = input.nextDouble();

        System.out.println("\nDigite 3 lado: ");
        c = input.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            if (a > b && a > c) {
                maior = a * 2;
                lados = b*2+c*2;
            } else {
                if (b > c) {
                    maior = b*2;
                    lados = a*2+c*2;
                } else {
                    maior = c*2;
                    lados = a*2+b*2;
                }
            }
            if (maior == lados) {
                System.out.println("\nTriangulo Retangulo");
            } else {
                if (maior > lados) {
                    System.out.println("\nTriangulo Obtusangulo");
                } else {
                    System.out.println("\nTriangulo Acutangulo");
                }
            }
        } else {
            System.out.println("\nAs medidas nao formam um triangulo");
        }
        System.out.println("\n");
    }
}
