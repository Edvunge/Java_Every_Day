package Java_COMPLETO_POO_Projetos.Aprender_JavaPOO_Nelio.Parte_6_EstruturasDeDados_ArraysColecoes;

import java.util.Scanner;

public class Exerc02_SomaVetor {
    // Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    //- Imprimir todos os elementos do vetor
    //- Mostrar na tela a soma e a média dos elementos do vetor
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double numN = input.nextDouble();

        double[] num = new double[(int) numN];

        for (int j = 0; j < numN; j++) {
            num[j] = j;
        }

        
        input.close();
    }
}
