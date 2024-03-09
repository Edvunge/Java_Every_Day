package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula20;

import java.util.Random;
import java.util.Scanner;

public class ProdutoDeMatrizes {
    // Produto de Matrizes:
    // Crie duas matrizes 3x3 e realize a multiplicação das duas matrizes,
    // armazenando o resultado em uma terceira matriz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        final int LEN = 3;
        int linha = 0, coluna = 0;
        int[][] mat1 = new int[LEN][LEN];
        int[][] mat2 = new int[LEN][LEN];
        int[][] mat3 = new int[LEN][LEN];

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                mat1[linha][coluna] = random.nextInt(10);
            }
        }


        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                mat2[linha][coluna] = random.nextInt(10);
            }
        }


        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                mat3[linha][coluna] = mat1[linha][coluna] * mat2[linha][coluna];
            }
        }

        System.out.println("=== MATRIZ 1 ===");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", mat1[linha][coluna]);
            }
            System.out.println(" \n ");
        }

        System.out.println("=== MATRIZ 2 ===");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", mat2[linha][coluna]);
            }
            System.out.println(" \n ");
        }


        System.out.println("=== MATRIZ 3 ===");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf("  %d  ", mat3[linha][coluna]);
            }
            System.out.println(" \n ");
        }

        input.close();
    }
}
