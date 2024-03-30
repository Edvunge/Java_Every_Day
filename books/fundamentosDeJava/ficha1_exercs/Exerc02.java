package books.fundamentosDeJava.ficha1_exercs;

import java.util.Scanner;

public class Exerc02 {
    // 2 - Faça um programa para ler um valor real e exiba o próximo inteiro.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero real: ");
        double num = input.nextDouble();

        double sucessor = num + 1.0;
        int numX = (int) sucessor;

        System.out.printf("o %.2f proximo numero: %d",num ,numX);

        input.close();
    }
}
