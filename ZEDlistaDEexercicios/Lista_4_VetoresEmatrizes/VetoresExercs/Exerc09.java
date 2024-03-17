package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        // Crie um programa que lê 6 valores inteiros pares e, em seguida, mostre na tela os valores
        // lidos na ordem inversa.
        Scanner input = new Scanner(System.in);
        final int LEN = 6;
        int i;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.println("Digite um numero: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = LEN - 1; i >= 0; i++) {
            if (vet_or_A[i] % 2 == 0) {
                System.out.printf(" %d ",vet_or_A[i]);
            }
        }
        input.close();
    }
}
