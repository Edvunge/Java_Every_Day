package InstitutoFederalRNeduBR.programcaoEstruturada_OrientadaObjetos.aula01_vetores_e_Matrizes;

import java.util.Scanner;

public class Exerc02vetIdades {
    // Desenvolva um programa que leia 10 idades, armazene num vetor (int) e depois percorra esse
    // vetor calculando a média das idades.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LENT = 10;
        int[] vetIdades = new int[LENT];
        int[] vetAux001 = new int[LENT];
        int mediaDasIdades = 0, soma = 0;

        for (int j = 0; j < LENT; j++) {
            System.out.printf("Digite a %d idade: ", j);
            vetIdades[j] = input.nextInt();
        }

        for (int i = 0; i < LENT; i++) {
            vetAux001[i] = vetIdades[i];
        }

        for (int l = 0; l < LENT; l++) {
            soma += vetAux001[l];
        }

        mediaDasIdades = (soma/LENT);
        System.out.println(" a media das idades eh de: " + mediaDasIdades);
    }
}
