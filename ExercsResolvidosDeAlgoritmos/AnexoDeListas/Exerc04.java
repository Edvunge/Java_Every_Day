package ExercsResolvidosDeAlgoritmos.AnexoDeListas;

public class Exerc04 {
    public static void main(String[] args) {
        // 4) Ler um vetor C de 10 elementos inteiros, trocar todos os valores negativos do vetor C por 0.
        // Escrever o vetor C modificado.
        final int LENT = 10;
        int[] vetC = {-12, 32, -4, -6, 8, -9, -10, -19, 5, 11};
        int[] vetorModificado = new int[LENT];

        for (int j = 0; j < LENT; j++) {
            if (vetC[j] < 0) {
                vetorModificado[j] = 0;
            }
        }

        for (int l = 0; l < LENT; l++) {
            System.out.println(" " + vetorModificado[l]);
        }
    }
}
