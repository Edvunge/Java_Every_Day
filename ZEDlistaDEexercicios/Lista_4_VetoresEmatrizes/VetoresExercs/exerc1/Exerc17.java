package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc1;

import java.util.Scanner;

public class Exerc17 {
    // 17. Leia um vetor de 10 posições e atribua valor 0 para todos os elementos que possuı́rem
    // valores negativos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int LEN = 10;
        int[] vet_or_A = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            System.out.println("Digite um valor: ");
            vet_or_A[i] = input.nextInt();
        }

        for (int i = 0; i < LEN; i++) {
            if (vet_or_A[i] < 0) {
                vet_or_A[i] = 0;
                System.out.printf(" %d ",vet_or_A[i]);
            } else {
                System.out.printf(" %d ",vet_or_A[i]);
            }
        }
        input.close();
    }
}
