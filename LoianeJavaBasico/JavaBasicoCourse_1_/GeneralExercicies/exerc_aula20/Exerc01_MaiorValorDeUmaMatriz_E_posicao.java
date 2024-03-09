package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula20;

import java.util.Random;
import java.util.Scanner;

public class Exerc01_MaiorValorDeUmaMatriz_E_posicao {
    public static void main(String[] args) {
        //  1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
        //  9. Após isso determine o maior número da matriz e a sua posição
        //  (linha, coluna)


       Scanner input = new Scanner(System.in);
        /*
             1.  2.  3.  4.

       1. -  2   3   3   4
       2. -  3   3   8   3
       3. -  1   9   5   4
       4. -  3   5   7   9

        */
        int coluna, linha;
        int[][] matA = new int[4][4];
        final int LEN = 4;
        int maxValue = 0, posValueLinha = 0, posValueColuna = 0;

        /*
        int integerRandomNumber = (int) (Math.random() * 5);
        System.out.println("integerRandomNumber = " + integerRandomNumber);

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matA[i][j] = rand();
            }
        }
        */

        Random random = new Random();

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                // Gerando valores aleatórios entre 0 e 9
                matA[linha][coluna] = random.nextInt(10);
            }
        }

        /*
        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++){
                System.out.printf(" Escreva o numero da linha [%d] coluna [%d]:  ", linha ,coluna);
                matA[linha][coluna] = input.nextInt();
            }
        }
        */

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                if (matA[linha][coluna] > maxValue) {
                    maxValue = matA[linha][coluna];
                    posValueLinha = linha;
                    posValueColuna = coluna;
                }
            }
        }

        System.out.printf("O Maior valor da matriz eh: %d \n",maxValue);
        System.out.printf("A Posicao do maior valor da matriz, linha: %d , coluna: %d ",posValueLinha ,posValueColuna);
        input.close();
    }
}
