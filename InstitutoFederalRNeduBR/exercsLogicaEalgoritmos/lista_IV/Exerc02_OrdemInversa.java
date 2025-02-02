package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista_IV;

import java.util.Scanner;

public class Exerc02_OrdemInversa {
    /*
        2. Escreva um algoritmo que leia 10 números e mostre-os na ordem inversa a que foram lidos.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LENTH = 10;
        int[] vet = new int[LENTH];

        for (int i = 0; i < LENTH; i++){
            System.out.printf("Digite: %d ",i);
            vet[i] = input.nextInt();
        }

        for (int j = 0; j < LENTH; j++){
            System.out.println(" " + vet[j]);
        }
    }
}
