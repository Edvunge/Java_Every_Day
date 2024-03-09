package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula19;

public class Exerc16 {
    /*
        16. Criar um vetor A com 10 elementos inteiros. Escrever um programa
        que calcule e escreva: a) a soma de elementos armazenados neste
        vetor que são inferiores a 15; b) a quantidade de elementos
        armazenados no vetor que são iguais a 15; e c) a média dos
        elementos armazenados no vetor que são superiores a 15.
    */
    public static void main(String[] args) {
        int len = 10;
        int vetorA[] = {34, 32, 38, 36, 32, 40, 21, 62, 41, 21};
        int elementsSuperiores15 = 0;
        int somaDosElementos = 0;
        int quantiddElementos = 0;
        int mediaDosElementos = 0;

        for (int i = 0; i < len; i++) {
            if (vetorA[i] > 15) {
                // a) a soma de elementos armazenados neste vetor que são inferiores a 15;
                somaDosElementos++;
            } else if (vetorA[i] == 15) {
                // b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
                quantiddElementos++;
            } else if (vetorA[i] < 15) {
                elementsSuperiores15++;
            }
        }


        // c) a média dos elementos armazenados no vetor que são superiores a 15.
        mediaDosElementos = (elementsSuperiores15)/len;

        System.out.printf("A media e de: %d\n",mediaDosElementos);
        System.out.printf("A soma do elementos eh de: %d\n",somaDosElementos);
        System.out.printf("A quantidade de elementos armazenados: %d\n",quantiddElementos);
    }
}