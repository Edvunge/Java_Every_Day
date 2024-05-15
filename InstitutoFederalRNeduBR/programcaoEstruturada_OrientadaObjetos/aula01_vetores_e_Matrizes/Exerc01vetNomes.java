package InstitutoFederalRNeduBR.programcaoEstruturada_OrientadaObjetos.aula01_vetores_e_Matrizes;

import java.util.Scanner;

public class Exerc01vetNomes {
    public static void main(String[] args) {
        // Desenvolva um programa que leia 10 nomes, armazene num vetor (de Strings) e depois percorra
        // esse vetor escrevendo os nomes presentes nele.
        Scanner input = new Scanner(System.in);

        String[] vetNomes = new String[10];

        for (int i = 0; i < vetNomes.length; i++) {
            System.out.printf("Na %d contagem, Digite o seu nome: ",i);
            vetNomes[i] = input.next();
        }

        for (int j = 0; j < vetNomes.length; j++) {
            System.out.printf("  Nome %d: %s  ",j ,vetNomes[j]);
        }
        input.close();
    }
}
