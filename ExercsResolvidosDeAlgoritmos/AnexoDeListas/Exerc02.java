package ExercsResolvidosDeAlgoritmos.AnexoDeListas;

public class Exerc02 {
    //  2) Preencher um vetor A de 10 elementos com os números inteiros de 1 a 10.
    //  Escrever o vetor A após o seu total preenchimento.
    //

    public static void main(String[] args) {
        final int LENT = 10;
        int[] elments = new int[LENT];
        int[] vetA = new int[LENT];

        for (int y = 0; y < 10; y++) {
            vetA[y] = y;
        }

        for (int k = 0; k < LENT; k++) {
            elments[k] = vetA[k];
            System.out.println(" " + elments[k]);
        }
    }
}
