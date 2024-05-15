package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.Lista05;

import java.util.Scanner;

public class Exerc01SomaDeMatrix {
    public static void main(String[] args) {
        // 1. Crie um algoritmo que leia uma matriz 4x5 de inteiros, calcule e imprima a
        // soma de todos os seus elementos.
        Scanner input =  new Scanner(System.in);
        final int LENT_X = 4;
        final int LENT_Y = 5;
        int[][] matAdd = new int[LENT_X][LENT_Y];
        int soma = 0;


        for (int linha = 0; linha < LENT_X; linha++) {
            for (int coluna = 0; coluna < LENT_Y; coluna++) {
                System.out.printf("Digite o [%d][%d] : ",linha ,coluna);
                matAdd[linha][coluna] = input.nextInt();
            }
        }


        for (int linha = 0; linha < LENT_X; linha++) {
            for (int coluna = 0; coluna < LENT_Y; coluna++) {
                soma += matAdd[linha][coluna];
            }
        }

        System.out.println("A soma dos valores todos eh: " + soma);

    }
}










