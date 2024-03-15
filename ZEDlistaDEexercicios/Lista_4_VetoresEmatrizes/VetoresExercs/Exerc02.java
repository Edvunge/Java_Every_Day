package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc02 {
    // 2. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int LEN = 6;
        int[] vet_or_A = new int[LEN];
        int i;

        for (i = 0; i < LEN; i++) {
            System.out.println("Digite algum numero: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            System.out.printf(" %d ",vet_or_A[i]);
        }
        input.close();
    }
}
