package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo43 {
    public static void main(String[] args) {
        // Entrar com um numero e imprimir o logaritmo desse numero na base 10
        Scanner input = new Scanner(System.in);

        System.out.println("digite o valor do logaritmo: ");
        double num = input.nextDouble();

        double logaritmo = Math.log(num) / Math.log(10);
        System.out.println("logaritmo: " + logaritmo );
    }
}
