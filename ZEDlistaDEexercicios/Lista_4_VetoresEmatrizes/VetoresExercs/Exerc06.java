package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        //  6. Faça um programa que receba do usuário um vetor com 10 posições. Em seguida deverá
        //  ser impresso o maior e o menor elemento do vetor.
        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int i, maxElemnt = 0, minElemnt = 0;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.println("digite um elemento para o vetor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            if (vet_or_A[i] > maxElemnt) {
                maxElemnt = vet_or_A[i];
            } else {
                minElemnt = vet_or_A[i];
            }
        }

        System.out.println("O valor maximo eh: " + maxElemnt);
        System.out.println("O valor minimo eh: " + minElemnt);
        input.close();
    }
}
