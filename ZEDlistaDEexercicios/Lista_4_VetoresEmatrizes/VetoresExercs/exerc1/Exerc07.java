package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc1;

import java.util.Scanner;

public class Exerc07 {
    // 7. Escreva um programa que leia 10 números inteiros e os armazene em um vetor.
    // Imprima o vetor, o maior elemento e a posição que ele se encontra.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int i, maxElemnt = 0, maxPosition = 0;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.println("Digite um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            if (vet_or_A[i] > maxElemnt) {
                maxElemnt = vet_or_A[i];
                maxPosition = i;
            }
        }

        for (i = 0; i < LEN; i++) {
            System.out.printf(" %d ",vet_or_A[i]);
        }

        System.out.println("\nO Maior valor eh: " + maxElemnt);
        System.out.println("A Posicao do maior valor eh: " + maxPosition);
        input.close();
    }
}
