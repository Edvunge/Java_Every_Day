package ExercsResolvidosDeAlgoritmos.Lista_3.A;

import java.util.Scanner;

public class Algoritmo161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        double num;

        for (c = 1; c <= 5; c++) {
            System.out.println("\nnumero: ");
            num = input.nextDouble();
            System.out.println("quadrado: " + num*2);
        }
        System.out.println("\n");
    }
}
