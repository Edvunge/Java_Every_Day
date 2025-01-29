package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc1;

import java.util.Scanner;

public class Exerc13 {
    // 13. Fazer um programa para ler 5 valores e, em seguida,
    // mostrar a posição onde se encontram o maior e o menor valor.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int LEN = 5;
        int[] vet_or_A = new int[LEN];
        int numPositionMin = 0;
        int numPositionMax = 0;
        int maxValue = 0;
        int minValue = 0;

        for (int i = 0; i < LEN; i++) {
            System.out.println("Digite o um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (int i = 0; i < LEN; i++) {
            if (vet_or_A[i] > maxValue) {
                maxValue = vet_or_A[i];
                numPositionMax = vet_or_A[i];
            } else {
                minValue = vet_or_A[i];
                numPositionMin = vet_or_A[i];
            }
        }

        System.out.printf("\nO maior valor: %d Sua posicao: %d\n",maxValue ,numPositionMax);
        System.out.printf("\nO menor valor: %d Sua posicao: %d\n",minValue ,numPositionMin);
        input.close();
    }
}