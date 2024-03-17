package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc14 {
    // 14. Faça um programa que leia um vetor de 10 posições e
    // verifique se existem valores iguais e os escreva na tela.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int i;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.print("digite um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            if (vet_or_A[i] == vet_or_A[i]) {
                System.out.printf(" %d " , vet_or_A[i]);
            }
        }

        input.close();
    }
}
