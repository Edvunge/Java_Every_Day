package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs;

public class Exerc01 {
    //  1. Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
    //  O programa deve executar os seguintes passos:
    //  (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
    //  (b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
    //  A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
    //  (c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
    //  (d) Mostre na tela cada valor do vetor A, um em cada linha.

    public static void main(String[] args) {
        final int LEN = 6;
        int i;
        int[] vet_or_A = new int[LEN];
        int soma = 0;

        vet_or_A[0] =  1;
        vet_or_A[1] =  0;
        vet_or_A[2] =  5;
        vet_or_A[3] = -2;
        vet_or_A[4] = -5;
        vet_or_A[5] =  7;

        for (i = 0; i < LEN; i++) {
            soma = (vet_or_A[0] + vet_or_A[1] + vet_or_A[5]);
        }

        vet_or_A[3] = 100;
        System.out.printf("A soma de vetor_A[%d], vetor_A[%d] e vetor_A[%d] = %d\n",vet_or_A[0] ,vet_or_A[1], vet_or_A[5], soma);

        System.out.println("  ");
        System.out.println("Elementos Finais do Vetor: ");
        for (i = 0; i < LEN; i++) {
            System.out.printf(" vetor_A[%d] \n",vet_or_A[i]);
        }
    }
}
