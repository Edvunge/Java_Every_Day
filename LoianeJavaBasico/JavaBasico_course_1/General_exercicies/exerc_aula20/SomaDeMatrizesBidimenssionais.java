package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula20;

import java.util.Random;
import java.util.Scanner;

public class SomaDeMatrizesBidimenssionais {
    // Soma de Matrizes:
    // Crie duas matrizes 3x3 e realize a soma das duas matrizes, armazenando o resultado em uma terceira matriz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        final int LEN = 0;
        int linha = 0, coluna;
        int[][] matM = new int[3][3];
        int[][] matQ = new int[3][3];
        int[][] matG = new int[3][3];

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                matM[linha][coluna] = random.nextInt(10);
            }
        }

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

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", matG[linha][coluna]);
            }
        }
        input.close();
    }
}
