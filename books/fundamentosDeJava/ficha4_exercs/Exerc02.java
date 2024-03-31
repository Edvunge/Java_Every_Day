package books.fundamentosDeJava.ficha4_exercs;

import java.util.Scanner;

public class Exerc02 {
    // 2. Construa um programa que leia a quantidade (Q) e o preço (PR) de 45 produtos
    // diferentes, comprados por uma empresa, e apresente o total gasto por ela.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorDoProduto;

        for (int i = 0; i < 4; i++) {
            System.out.println("digite o valor do produto: ");
            valorDoProduto = input.nextDouble();
        }

        input.close();
    }
}
