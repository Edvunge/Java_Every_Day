package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salmin, salpe, num;

        System.out.println("entre com o salario minimo: ");
        salmin = input.nextDouble();

        System.out.println("entre com o salario da pessoa: ");
        salpe = input.nextDouble();

        num = salpe/salmin;
        System.out.println("Pessoa ganha " + num + " salario minimos");
        input.close();
    }
}
