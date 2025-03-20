package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_6_estruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc07Abaixo_da_Media {
    //  Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    //  mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    //  os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media = 0.0, soma = 0.0;
        double[] elementAbaixoDaMedia;

        System.out.println("Quantos elementos vai ter o vetor? ");
        int numVet = input.nextInt();

        double[] vetNumA = new double[numVet];

        for (int j = 0; j < numVet; j++) {
            System.out.println("Digite um numero: ");
            vetNumA[j] = input.nextDouble();
        }

        for (int j = 0; j < numVet; j++) {
            soma += vetNumA[j];
        }

        media = (soma)/numVet;
        elementAbaixoDaMedia = new double[numVet];

        for (int j = 0; j < numVet; j++) {
            if(vetNumA[j] < media) {
                elementAbaixoDaMedia[j] = vetNumA[j];
            }
        }

        for (int j = 0; j < numVet; j++) {
            System.out.printf(" %.1f ", elementAbaixoDaMedia[j]);
        }
        input.close();
    }
}
