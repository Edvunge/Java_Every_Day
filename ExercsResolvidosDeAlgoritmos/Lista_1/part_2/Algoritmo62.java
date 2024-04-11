package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Algoritmo62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double preco, npreco;

        System.out.println("digite o valor do produto: ");
        preco = input.nextDouble();

        npreco = preco * 0.91;

        System.out.println("preco com desconto: " + npreco);
    }
}
