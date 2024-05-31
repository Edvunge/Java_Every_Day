package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula20;

import java.util.Random;
import java.util.Scanner;

public class SomaDeMatrizesBidimenssionais {
    // Soma de Matrizes:
    // Crie duas matrizes 3x3 e realize a soma das duas matrizes, armazenando o resultado em uma terceira matriz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        final int LEN = 3;
        int linha = 0, coluna = 0;
        int[][] matM = new int[LEN][LEN];
        int[][] matQ = new int[LEN][LEN];
        int[][] matG = new int[LEN][LEN];

        // matriz M 3x3 de forma aleatoria
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                matM[linha][coluna] = random.nextInt(10);
            }
        }

        // matriz Q 3x3 de forma aleatoria
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                matQ[linha][coluna] = random.nextInt(10);
            }
        }


        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                matG[linha][coluna] = matM[linha][coluna] + matQ[linha][coluna];
            }
        }


        // =================================
        // IMPRESSAO NA TELA DA MATRIZ M
        // =================================
        System.out.println("IMPRESSAO NA TELA DA MATRIZ M");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", matM[linha][coluna]);
            }
            System.out.println(" \n ");
        }

        // =================================
        // IMPRESSAO NA TELA DA MATRIZ Q
        // =================================
        System.out.println("IMPRESSAO NA TELA DA MATRIZ Q\n");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", matQ[linha][coluna]);
            }
            System.out.println(" \n ");
        }

        // =================================
        // IMPRESSAO NA TELA DA MATRIZ G
        // =================================
        System.out.println("IMPRESSAO NA TELA DA MATRIZ G");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", matG[linha][coluna]);
            }
            System.out.println(" \n ");
        }
        input.close();
    }
}
