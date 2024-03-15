package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc03 {
    //  3. Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado das
    //  componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos têm
    //  10 elementos cada. Imprimir todos os conjuntos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int[] vet_or_A = new int[LEN];
        int[] vet_or_B = new int[LEN];
        int i;

        for (i = 0; i < LEN; i++) {
            System.out.print("Digite Algum Numero: ");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            vet_or_B[i] = (vet_or_A[i] * vet_or_A[i]);
        }

        for (i = 0; i < LEN; i++) {
            System.out.printf(" %d ",vet_or_B[i]);
        }
        input.close();
    }
}
