package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {
        //  11. Faça um programa que preencha um vetor com 10 números reais, calcule e mostre a
        //  quantidade de números negativos e a soma dos números positivos desse vetor.
        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int i;
        double quantddNumersNegativos = 0.0;
        double somaDosNumrsPositivos = 0.0;
        double[] vet_or_A = new double[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.print("digite um numero: ");
            vet_or_A[i] = input.nextDouble();
        }

        for (i = 0; i < LEN; i++) {
            if (vet_or_A[i] < 0) {
                quantddNumersNegativos++;
            } else {
                somaDosNumrsPositivos += vet_or_A[i];
            }
        }

        System.out.println("Quantidade de numeros negativos: " + quantddNumersNegativos);
        System.out.println("Soma de numeros positivos: " + somaDosNumrsPositivos);
        input.close();
    }
}
