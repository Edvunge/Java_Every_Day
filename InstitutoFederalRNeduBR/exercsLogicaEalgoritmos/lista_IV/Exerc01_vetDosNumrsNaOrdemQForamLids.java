package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista_IV;

import java.util.Scanner;

public class Exerc01_vetDosNumrsNaOrdemQForamLids {
    /*
        1. Escreva um algoritmo	que	leia 10	números
        e	mostre‐os na ordem em que foram lidos.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LENS = 10;
        int[] vet = new int[LENS];

        for (int i = 0; i < LENS; i++) {
            System.out.println("digite: " + i);
            vet[i] = input.nextInt();
        }

        for (int j = 0; j < LENS; j++) {
            System.out.println(" " + vet[j]);
        }
    }
}
