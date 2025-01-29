package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc1;

import java.util.Scanner;

public class Exerc10 {
    // 10. Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
    //e imprima a média geral.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 15;
        int i, mediaGeral = 0;
        int soma = 0;
        int[] vet_or_A = new int[LEN];

        for (i = 0; i < LEN; i++) {
            System.out.println("digite um valor");
            vet_or_A[i] = input.nextInt();
        }

        for (i = 0; i < LEN; i++) {
            soma += vet_or_A[i];
        }

        mediaGeral = (soma/LEN);
        System.out.println("A media do alunos e de: " + mediaGeral);
        input.close();
    }
}
