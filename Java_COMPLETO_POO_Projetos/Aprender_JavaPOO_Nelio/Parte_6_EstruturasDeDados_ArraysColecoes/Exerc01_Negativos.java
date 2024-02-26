package Java_COMPLETO_POO_Projetos.Aprender_JavaPOO_Nelio.Parte_6_EstruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc01_Negativos {
    // Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    // e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = input.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }

        input.close();
    }
}
