package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        // 5. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.

        Scanner input = new Scanner(System.in);
        final int LEN = 10;
        int[] vet = new int[LEN];
        int i, numrsPares = 0;

        for (i = 0; i < LEN; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = input.nextInt();
        }

        System.out.print("\nNumeros Pares no vetor: \n");
        for (i = 0; i < LEN; i++) {
            if (i % 2 == 0) {
                System.out.printf(" %d ",vet[i]);
                numrsPares++;
            }
        }

        System.out.printf("\nNumero Total de Pares: %d ",numrsPares);
        input.close();
    }
}
