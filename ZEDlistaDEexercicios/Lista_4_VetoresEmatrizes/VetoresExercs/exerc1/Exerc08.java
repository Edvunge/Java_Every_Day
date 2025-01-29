package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc1;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        // 8. Crie um programa que lê 6 valores inteiros e, em seguida,
        // mostre na tela os valores lidos na ordem inversa.

        Scanner input = new Scanner(System.in);
        final int LEN = 6;
        int i;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.println("Digite um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = LEN - 1; i >= 0; i--) {
            System.out.printf(" %d ",vet_or_A[i]);
        }
        input.close();
    }
}
