package ZEDlistaDEexercicios.CadernoDeExercicios.G_EXERCICIOS_VETORES_MATRIZES;

import java.util.Random;

public class Exerc131 {
    // 131. Faça um algoritmo para somar duas matrizes.
    public static void main(String[] args) {
        final int len = 10;
        int[][] mat1 = new int[10][10]; //{ {21, 22, 23, 15, 16, 17, 18, 19, 10, 14}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 10} };
        int[][] mat2 = new int[10][10]; //= { {11, 12, 13, 14, 15, 16, 17, 18, 19, 10}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 20} };
        int[][] somaMat = new int[len][len];

        Random random = new Random();

        for (int linha = 0; linha < len; linha++) {
            for (int coluna = 0; coluna < len; coluna++) {
                mat1[linha][coluna] = random.nextInt(10);
                mat2[linha][coluna] = random.nextInt(10);
            }
        }
    }
}
