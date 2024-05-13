package ExercsResolvidosDeAlgoritmos.AnexoDeListas;

public class Exerc03 {

    //  3) Preencher um vetor B de 10 elementos com 1 se o índice do elemento for ímpar e com 0 se for par.
    //  Escrever o vetor B após o seu total preenchimento.

    public static void main(String[] args) {
        final int LENT = 10;
        int[] vetB = new int[LENT];
        int indice;

        for (int k = 0; k < LENT; k++) {
            indice = k;
            if (indice % 2 == 0) {
                vetB[k] = 1;
            } else {
                vetB[k] = 0;
            }
        }

        for (int l = 0; l < LENT; l++) {
            System.out.println(" " + vetB[l]);
        }

    }
}
