package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, aux;

        System.out.println("digite 1 numero com ponto: ");
        a = input.nextDouble();

        System.out.println("digite 2 numero com ponto: ");
        b = input.nextDouble();

        aux = a;
        a = b;
        b = aux;
        System.out.println("a = " + a + " b = " + b);
        input.close();
    }
}
