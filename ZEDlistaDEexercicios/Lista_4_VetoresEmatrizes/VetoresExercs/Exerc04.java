package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

import java.util.Scanner;

public class Exerc04 {
    // 4. Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores X e Y
    // quaisquer correspondentes a duas posições no vetor.
    // Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y .
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 8;
        int[] vet_or_A = new int[LEN];
        int x, y;


        for (int i = 0; i < LEN; i++) {
            System.out.println("digite um valor: " );
            vet_or_A[i] = input.nextInt();
        }


        System.out.println("Digite o valor de X");
        x = input.nextInt();

        System.out.println("Digite o valor de Y");
        y = input.nextInt();

        vet_or_A[2] = x;
        vet_or_A[3] = y;

        int soma = vet_or_A[2] + vet_or_A[3];
        System.out.printf("A Soma de %d + %d = %d",vet_or_A[2], vet_or_A[3], soma);
        input.close();
    }
}
