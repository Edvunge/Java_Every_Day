package ExercsResolvidosDeAlgoritmos.AnexoDeListas;

import java.util.Scanner;

public class Exerc01 {
    /*
    1) Preencher (ler) um vetor X de 10 elementos com o valor inteiro 30. Escrever o vetor X após seu
    total preenchimento.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LENT = 10;
        int[] vetX = new int[LENT];

        for (int i = 0; i < LENT; i++) {
            vetX[i] = 30;
        }

        System.out.println("apos o preechimento do valores: ");
        for(int l = 0; l < vetX.length; l++) {
            System.out.println(" " + vetX[l]);
        }
    }
}
