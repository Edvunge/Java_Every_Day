package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula20;

import java.util.Random;
import java.util.Scanner;

public class Exerc02_MaiorEmenor_linhaColuna {
    // 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
    //    0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
    //    qual é o maior e o menor valor da coluna 7.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        final int LEN = 10;
        int coluna, linha;
        int[][] matA = new int[10][10];
        int maxValueLinhaX5 = 0, minValueLinhaX5 = 0;
        int maxValueColunaY7 = 0, minValueColunaY7 = 0;

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                matA[linha][coluna] = random.nextInt(10);
            }
        }

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {

                if (matA[linha][coluna] > maxValueLinhaX5) {
                    maxValueLinhaX5 = matA[linha][coluna];
                }


                if (matA[linha][coluna] < minValueLinhaX5) {
                    minValueLinhaX5 = matA[linha][coluna];
                }


                if (matA[linha][coluna] > maxValueColunaY7) {
                    maxValueColunaY7 = matA[linha][coluna];
                }


                if (matA[linha][coluna] < minValueColunaY7) {
                    minValueColunaY7 = matA[linha][coluna];
                }
            }
        }

        System.out.printf("Maior da linha 5 eh: %d, \nMenor valor da linha 5 eh: %d ",maxValueLinhaX5 ,minValueLinhaX5);
        System.out.printf("Maior da coluna 7 eh: %d, \nMenor valor da coluna 7 eh: %d ",maxValueColunaY7 ,minValueColunaY7);

        input.close();
    }
}
