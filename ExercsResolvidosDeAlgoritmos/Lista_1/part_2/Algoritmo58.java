package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double xnum1, xnum2, xnum3, x;

        System.out.println("Entrar com 1 valor: ");
        xnum1 = input.nextInt();

        System.out.println("Entrar com 2 valor: ");
        xnum2 = input.nextInt();

        System.out.println("Entrar com 3 valor: ");
        xnum3 = input.nextInt();

        x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 *(xnum1 - xnum2) + Math.log(64.)/Math.log(2.);

        System.out.println("X = " + x);
        input.close();
    }
}
