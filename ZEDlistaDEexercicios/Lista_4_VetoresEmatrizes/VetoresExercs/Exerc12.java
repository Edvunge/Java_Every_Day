package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc12 {
    // 12. Fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores lidos
    // juntamente com o maior, o menor e a média dos valores.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 5;
        int i, maxValue = 0, minValue = 0;
        double mediaValue = 0.0, soma = 0.0;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.print("digite um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            System.out.printf(" %d ",vet_or_A[i]);

            if (vet_or_A[i] > maxValue) {
                maxValue = vet_or_A[i];
            } else {
                minValue = vet_or_A[i];
            }

            soma += vet_or_A[i];
        }
        mediaValue = soma;
        System.out.println("\n   Maior Valor:  " + maxValue);
        System.out.println("   Menor Valor:  " + minValue);
        System.out.println("   Media de Valores:  " + mediaValue);
        input.close();
    }
}
