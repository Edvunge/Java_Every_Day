package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula20;

import java.util.Random;

public class MaiorElementoPorLinha {
    //  Maior Elemento por Linha:
    //  Crie uma matriz 4x4 e encontre o maior elemento em cada linha,
    //  armazenando os resultados em um vetor.
    public static void main(String[] args) {
        Random random = new Random();

        /*
        _____________
          1 2 3 4
          5 6 7 8
          9 8 7 6
          4 3 2 1
        ____________
        */

        final int LEN = 4;
        int linha, coluna;
        int[][] matM = new int[LEN][LEN];
        int[][] matResultante = new int[LEN][LEN];

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                matM[linha][coluna] = random.nextInt(10);
            }
        }

        System.out.printf("==== MATRIZ M ====\n");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf(" %d ", matM[linha][coluna]);
            }
            System.out.println();
        }

        for (linha = 0; linha < LEN; linha++) {
            int maiorElementoLinha = matM[linha][0];
            for (coluna = 1; coluna < LEN; coluna++) {
                if (matM[linha][coluna] > maiorElementoLinha) {
                    maiorElementoLinha = matM[linha][coluna];
                }
            }
            matResultante[linha][linha] = maiorElementoLinha;
        }

        System.out.printf("\n==== MATRIZ RESULTANTE ====\n");
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf(" %d ",matResultante[linha][coluna]);
            }
        }
    }
}
