package InstitutoFederalRNeduBR.programcaoEstruturada_OrientadaObjetos.aula01_vetores_e_Matrizes;

import java.util.Scanner;

public class Exerc04mat3D {
    //  Capture do teclado valore para o preenchimento de uma matriz M 3x3. Após a captura imprima a matriz criada e
    //  encontre a quantidade de números pares e a quantidade de números ímpares.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LENT = 3;
        int[][] matPreench = new int[LENT][LENT];
        int quantddPares = 0, quantddImpares = 0;


        for (int linha = 0; linha < LENT; linha++) {
            for (int coluna = 0; coluna < LENT; coluna++) {
                System.out.printf("Digite o [%d][%d] : ",linha ,coluna);
                matPreench[linha][coluna] = input.nextInt();
            }
        }


        for (int linha = 0; linha < LENT; linha++) {
            for (int coluna = 0; coluna < LENT; coluna++) {
                if (matPreench[linha][coluna] % 2 == 0) {
                    quantddPares++;
                } else {
                    quantddImpares++;
                }
            }
        }


        System.out.println("A Quantidade de numeros Pares: " + quantddPares);
        System.out.println("A Quantidade de numeros Impares: " + quantddImpares);


    }
}
