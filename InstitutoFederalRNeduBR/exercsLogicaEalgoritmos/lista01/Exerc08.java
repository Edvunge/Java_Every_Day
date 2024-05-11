package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc08 {
    // 8. leia dois números inteiros e imprima o produto.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite  o primeiro numero: ");
        int num = input.nextInt();

        System.out.println("digite o segundo numero: ");
        int num2 = input.nextInt();

        int produto = (num * num2);
        System.out.println("O produto: " + num + " eh " + num2 + " = " + produto);
    }
}
