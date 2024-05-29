package JavaCOMPLETO_DoZeroAoProfissional_Projts_leonardoLeitao.section06_arraysCollections.arrays;

import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        // 2, 3, 44, 5, 4, 22, 12
        // mediaDoslunos
        Scanner input = new Scanner(System.in);

        System.out.println("digite quantos notas quer considerar: ");
        int notasPorConsiderar = input.nextInt();

        double[] notas = new double[notasPorConsiderar];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nDigite o [%d] elemento. ", i);
            notas[i] = input.nextDouble();
        }

        double soma = 0, media = 0;
        for (int h = 0; h < notas.length; h++) {
            soma += notas[h];
        }

        media = soma/notasPorConsiderar;
        System.out.println("A media eh de: " + media);
    }
}
