package ZEDlistaDEexercicios.CadernoDeExercicios.G_EXERCICIOS_VETORES_MATRIZES;

public class Exerc128 {
    public static void main(String[] args) {
        //  128. Faça um algoritmo que faça a união de dois vetores de mesmo tamanho e
        //  mesmo tipo em um terceiro vetor com dobro do tamanho.
        final int len = 10;
        int[] vetA = {11, 21, 31, 41, 51, 61, 71, 81, 91, 31};
        int[] vetB = {11, 12, 13, 14, 15, 16, 17, 18, 19, 13};
        int[] vetC = new int[len];

        for (int i = 0; i < len; i++) {
            vetC[i] = (vetA[i] * vetB[i]);
        }

        for (int i = 0; i < len; i++) {
            System.out.printf(" %d ",vetC[i]);
        }
    }
}
