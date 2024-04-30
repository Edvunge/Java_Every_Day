package ESTUDOS.ARRAYS_exrcs;

import java.util.Scanner;

public class Exercs029 {
    public static void main(String[] args) {
        /*
        29 - faca um programa que receba 6 numeros inteiros e mostre:

        * Os numeros pares digitados;
        * A soma dos numeros pares digitados;
        * Os numeros impares digitados;
        * A quantidade de numeros impares digitados;

        */
        final int TAM = 6;
        int[] array = {2, 4, 5, 7, 9, 12};
        int j, somaDoNumersPares = 0, quantidadeDeNumrsImparesDitgds = 0;

        for (j = 0; j < TAM; j++) {
            if (array[j] % 2 == 0) {
                System.out.println("os numeros pares sao: ");
                System.out.println(array[j]);
                somaDoNumersPares += array[j];
            } else {
                System.out.println("os numeros impares sao: ");
                System.out.println(array[j]);
                quantidadeDeNumrsImparesDitgds++;
            }
        }
        System.out.println("A SOMA DOS NUMEROS PARES: " + somaDoNumersPares);
    }
}
