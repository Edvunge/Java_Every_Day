package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_6_estruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc04_numersPares {
    //  Faça um programa que leia N números inteiros e armazene-os em um vetor.
    //  Em seguida, mostre na
    //  tela todos os números pares, e também a quantidade de números pares.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPares = 0, quantddPares = 0;


        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        int[] vet = new int[num];

        for (int j = 0; j < num; j++) {
            System.out.println("Escreve um numero: ");
            vet[j] = input.nextInt();
        }

        System.out.println("Numeros Pares: ");
        for (int j = 0; j < num; j++) {
            if (vet[j] % 2 == 0) {
                System.out.print(vet[j] + " ");
                quantddPares++;
            }
        }

        System.out.println("\nQuantidade de pares: " + quantddPares);
        input.close();
    }
}
