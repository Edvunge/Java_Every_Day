package ZEDlistaDEexercicios.CadernoDeExercicios.G_EXERCICIOS_VETORES_MATRIZES;

public class Exerc127 {
    //  127. Faça um algoritmo que some o conteúdo de dois vetores e armazene o
    //  resultado em um terceiro vetor.
    public static void main(String[] args) {
        final int len = 10;
        int[] vetNum1 = {19, 28, 27, 16, 15, 24, 32, 52, 12, 10};
        int[] vetNum2 = {21, 43, 13, 14, 16, 17, 16, 23, 22, 12};
        int[] vetNum3 = new int[len];


        for (int i = 0; i < len; i++) {
            vetNum3[i] = vetNum2[i] + vetNum1[i];
        }

        for (int i = 0; i < len; i++) {
            System.out.printf(" %d\n ",vetNum3[i]);
        }
    }
}
