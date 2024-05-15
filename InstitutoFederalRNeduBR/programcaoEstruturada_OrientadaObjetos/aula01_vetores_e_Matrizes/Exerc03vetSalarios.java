package InstitutoFederalRNeduBR.programcaoEstruturada_OrientadaObjetos.aula01_vetores_e_Matrizes;

import java.util.Scanner;

public class Exerc03vetSalarios {
    public static void main(String[] args) {
        // Desenvolva um programa que leia 10 salários, armazene num vetor (double) e depois percorra
        // esse vetor identificando qual o índice do maior salário.
        Scanner input = new Scanner(System.in);
        final int LENT = 10;
        double[] vetSalario = new double[LENT];
        int indice = 0;

        for (int j = 0; j < LENT; j++) {
            System.out.printf("Funcionario: %d ", j);
            System.out.println("Digite o valor do seu salario: ");
            vetSalario[j] = input.nextDouble();
        }

        for (int n = 0; n < LENT; n++) {
            if (vetSalario[n] > indice) {
                indice = n;
            }
        }

        System.out.println("o INDICE DO MAIOR VALOR EH: " + indice);
    }
}
