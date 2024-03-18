package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc18 {
    //  18. Faça um programa que leia um vetor de 10 números. Leia um número x. Conte os
    //  múltiplos de um número inteiro x num vetor e mostre-os na tela.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int[] vet_or_A = new int[LEN];
        int x;

        for (int i = 0; i < LEN; i++) {
            System.out.println("digite um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        System.out.println("Digite um valor Qualquer: ");
        x = input.nextInt();

        for (int i = 0; i < LEN; i++) {
            if (vet_or_A[i] % x == 0) {
                System.out.printf(" %d ",vet_or_A[i]);
            } else {
                System.out.printf(" %d ",vet_or_A[i]);
            }
        }
        input.close();
    }
}
