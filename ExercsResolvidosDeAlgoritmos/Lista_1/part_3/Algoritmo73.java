package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num, numFrac;
        int num1, numA;

        System.out.println("entre com um numero com parte fracionaria: ");
        num = input.nextInt();

        num1 = (int) (num - 0.5);
        numFrac = num - num1;
        numA = (int) (num + 0.00001);

        System.out.println("parte inteira: " + num1);
        System.out.println("parte fracionaria: " + ((numFrac+0.000001)*3));
        System.out.println("numero arredondado: " + numA);
        input.close();
    }
}
