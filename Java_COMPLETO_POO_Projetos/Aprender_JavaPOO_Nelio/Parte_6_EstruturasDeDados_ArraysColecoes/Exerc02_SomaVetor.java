package Java_COMPLETO_POO_Projetos.Aprender_JavaPOO_Nelio.Parte_6_EstruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc02_SomaVetor {
    //  Faça um programa que leia N números reais e armazene-os em um vetor.
    //  Em seguida:
    //  - Imprimir todos os elementos do vetor
    //  - Mostrar na tela a soma e a média dos elementos do vetor

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i=0; i<n; i++) {
            soma = soma + vetor[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);
        sc.close();
    }
}
