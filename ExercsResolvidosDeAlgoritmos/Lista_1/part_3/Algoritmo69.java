package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, denom;

        System.out.println("digite o numerador: ");
        num = input.nextInt();

        System.out.println("digite o denominador: ");
        denom = input.nextInt();

        System.out.println("decimal: " + (num/denom));
        input.close();
    }
}
