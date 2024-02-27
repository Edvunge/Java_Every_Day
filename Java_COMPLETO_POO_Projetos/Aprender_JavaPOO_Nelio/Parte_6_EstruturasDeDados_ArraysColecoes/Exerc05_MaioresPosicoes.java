package Java_COMPLETO_POO_Projetos.Aprender_JavaPOO_Nelio.Parte_6_EstruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc05_MaioresPosicoes {
    // Faça um programa que leia N números reais e armazene-os em um vetor.
    // Em seguida, mostrar na tela, o maior número do vetor (supor não haver empates).
    // Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maxValue = 0;
        int positionNumber = 0;

        System.out.println("Escreva um numero: ");
        double numeros = input.nextDouble();

        double[] vetNum = new double[(int) numeros];

        for (int j = 0; j < numeros; j++) {
            System.out.println("Digite um numero: ");
            vetNum[j] = input.nextDouble();
        }

        for (int j = 1; j < numeros; j++) {
            if (vetNum[j] > maxValue) {
                maxValue = vetNum[j];
                positionNumber = j;
            }
        }

        System.out.println("MAIOR VALOR = " + maxValue);
        System.out.println("POSICAO DO MAIOR VALOR = " + positionNumber);
        input.close();
    }
}
/*

double[] vetor = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextDouble();
	    }

	    maior = vetor[0];
	    posmaior = 0;

	    for (int i=1; i<n; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
	            posmaior = i;
	        }
	    }
*/