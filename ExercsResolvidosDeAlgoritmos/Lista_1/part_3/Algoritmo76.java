package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("digite numero: ");
        num = input.nextInt();

        System.out.println("sucessor: " + (num + 1) % 61);

        input.close();
    }
}
