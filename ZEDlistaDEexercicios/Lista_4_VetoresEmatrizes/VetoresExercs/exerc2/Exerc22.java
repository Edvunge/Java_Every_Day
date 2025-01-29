package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc2;

public class Exerc22 {
    /*
    22. Faca um programa que leia dois vetores de 10 posicoes e calcule outro vetor contendo,
        nas posicoes pares os valores do primeiro e nas posicoes impares os valores do segundo.
    */
    public static void main(String[] args) {
        final int LEN = 10;
        int[] vetA = {12, 13, 11, 14, 19, 18, 17, 10, 15, 16};
        int[] vetB = {22, 23, 21, 24, 29, 28, 27, 20, 25, 26};

        int[] vetC = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            if (vetA[i] % 2 == 0) {
                vetC[i] = vetA[i];
            } else {
                vetC[i] = vetB[i];
            }
        }

        System.out.println("vetor c: ");
        for (int y = 0; y < LEN; y++) {
            System.out.println(vetC[y]);
        }
    }
}
