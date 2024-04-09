package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo37 {
    public static void main(String[] args) {
        // ler dois numeros inteiros e imprimir o produto.
        Scanner input = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num = input.nextInt();

        System.out.println("digite o primeiro numero: ");
        int num1 = input.nextInt();

        int produto = num * num1;
        System.out.println("produto: " + produto);
    }
}
