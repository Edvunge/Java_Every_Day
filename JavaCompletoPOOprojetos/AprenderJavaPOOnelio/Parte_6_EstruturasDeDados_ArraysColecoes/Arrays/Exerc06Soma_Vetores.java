package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_6_EstruturasDeDados_ArraysColecoes;

import java.util.Scanner;

import static java.lang.System.out;

public class Exerc06Soma_Vetores {
    //  Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    //  terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    //  o vetor C gerado.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vet_valueA;
        int[] vet_valueB;
        int[] vet_valueC;

        out.println("Quantos valores vai ter cada vetor? ");
        int numVet = input.nextInt();

        vet_valueA = new int[numVet];
        vet_valueB = new int[numVet];

        for (int j = 0; j < numVet; j++) {
            out.println("Digite os valores do vetor A: ");
            vet_valueA[j] = input.nextInt();
        }

        for (int j = 0; j < numVet; j++) {
            out.println("Digite os valores do vetor B: ");
            vet_valueB[j] = input.nextInt();
        }

        vet_valueC = new int[numVet];

        for (int j = 0; j < numVet; j++) {
            vet_valueC[j] = vet_valueA[j] + vet_valueB[j];
        }

        for (int j = 0; j < numVet; j++) {
            System.out.printf(" %d ", vet_valueC[j]);
        }

        input.close();
    }
}
