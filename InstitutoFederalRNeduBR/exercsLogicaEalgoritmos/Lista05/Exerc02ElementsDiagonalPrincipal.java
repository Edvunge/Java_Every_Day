package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.Lista05;

import java.util.Scanner;

public class Exerc02ElementsDiagonalPrincipal {
    public static void main(String[] args) {
        // 2. Crie um algoritmo que leia os elementos de uma matriz inteira 5x5 e
        //imprima os elementos da diagonal principal.
        Scanner input = new Scanner(System.in);
        final int LENT = 5;
        int[][] matrixPrincipal = new int[LENT][LENT];

        for (int linha = 0; linha < LENT; linha++) {
            for (int coluna = 0; coluna < LENT; coluna++) {
                System.out.printf("Digite o valor da [%d][%d]: ",linha ,coluna);
                matrixPrincipal[linha][coluna] = input.nextInt();
            }
        }


        //for (int linha = 0; linha < LENT; linha++) {
          //  for (int coluna = 0; coluna < LENT; coluna++) {
                System.out.println(" " + matrixPrincipal[0][4]);
                System.out.println(" " + matrixPrincipal[1][3]);
                System.out.println(" " + matrixPrincipal[2][2]);
                System.out.println(" " + matrixPrincipal[3][1]);
                System.out.println(" " + matrixPrincipal[4][0]);
                // mat[1][5]
                // mat[2][4]
                // mat[3][3]
                // mat[4][2]
                // mat[5][1]
            //}
        //}
        /*

     1   2   3   4   5
--------------------------
1 |  2   2   2   2   1
  |
2 |  2   2   2   1   2
  |
3 |  2   2   1   2   2
  |
4 |  2   1   2   2   2
  |
5 |  1   2   2   2   2
--------------------------

mat[1][5]
mat[2][4]
mat[3][3]
mat[4][2]
mat[5][1]


 */
    }
}
