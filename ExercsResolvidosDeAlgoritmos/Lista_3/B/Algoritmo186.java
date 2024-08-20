package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo186 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Entrar com quatro números e imprimir o cubo e a raiz cúbica de cada número.
        */

        int a;
        double numero;

        for ( a = 1; a <= 4; a++) {
            System.out.println("digite numero:");
            numero = input.nextDouble();

            System.out.printf("cubo: ", numero * 3);

            /*if (numero < 1O) {
                System.out.printf("\nNao faco raiz de numero negativo:");
            } else {
                System.out.printf("\nraiz: ", numero *(1/3);
            }*/
        }
    }
}
