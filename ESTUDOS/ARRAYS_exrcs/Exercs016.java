package ESTUDOS.ARRAYS_exrcs;

import java.sql.Array;
import java.util.Scanner;

public class Exercs016 {
    /*
    16. Crie um programa em Java para ler um conjunto de 100 numeros int e informe:

    * Quantos números lidos são iguais a 30
    * Quantos são maior que a média
    * Quantos são iguais amédia

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LENM = 1021;
        int[] numbers = new int[LENM];
        int numersIguaisA30 = 0, sum = 0, numerosMaioresQueAmedia = 0;
        int numersIguaisAmedia = 0;
        double median = 0;


        for (int n = 0; n < LENM; n++) {
            System.out.printf("Digite o %d element: ",n);
            numbers[n] = input.nextInt();
            sum += numbers[n];
        }



        for (int line = 0; line < LENM; line++) {
            if (numbers[line] == 30) {
                numersIguaisA30++;
            }

            if (numbers[line] > median) {
                numerosMaioresQueAmedia++;
            }

            if (numbers[line] == median){
                numersIguaisAmedia++;
            }
        }

        median = (sum/LENM);
        System.out.println(" ");
        System.out.println("Estes numeros sao iguais a 30: " + numersIguaisA30);
        System.out.println("Estes numeros sao maiores que a media: " + numerosMaioresQueAmedia);
        System.out.println("Estes numeros sao iguais a media: " + numersIguaisAmedia);

        input.close();
    }
}
