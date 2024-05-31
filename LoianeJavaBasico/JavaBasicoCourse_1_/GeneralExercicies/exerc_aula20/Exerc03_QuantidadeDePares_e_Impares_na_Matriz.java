package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula20;

import java.util.Scanner;

public class Exerc03_QuantidadeDePares_e_Impares_na_Matriz {
    //  3. Capture do teclado valores para preenchimento de uma matriz M
    //  3x3. Após a captura imprima a matriz criada e encontre a
    //  quantidade de números pares, a quantidade de números ímpares.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 3;
        int linha, coluna;
        int[][] matM = new int[3][3];
        int quantidadeNumersPares = 0, quantidadeNumersImpares = 0;

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf(" Escreva o numero da linha [%d] coluna [%d]:  ", linha ,coluna);
                matM[linha][coluna] = input.nextInt();
            }
        }

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                if (matM[linha][coluna] % 2 == 0) {
                    quantidadeNumersPares++;
                } else {
                    quantidadeNumersImpares++;
                }
            }
        }

        for (linha = 0; linha < LEN; linha++) {
            for (coluna = 0; coluna < LEN; coluna++) {
                System.out.printf(" %d ",matM[linha][coluna]);
            }
        }

        System.out.println("\nA Quantidade de numeros Pares: " + quantidadeNumersPares);
        System.out.println("A Quantidade de numeros Impares: " + quantidadeNumersImpares);
        input.close();
    }
}
