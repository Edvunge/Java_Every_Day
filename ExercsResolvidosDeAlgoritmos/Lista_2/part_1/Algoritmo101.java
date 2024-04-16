package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo101 {
    public static void main(String[] args) {
        // Construir um algoritmo que indique se o numero digitado esta compreendido
        // entre 20 e 90 ou nao
        Scanner input = new Scanner(System.in);
        double num;

        System.out.println("\nDigite numero: ");
        num = input.nextDouble();

        if (num > 20 && num < 90) {
            System.out.println("\nO numero esta na faixa de 20 a 90, exclusive");
        } else {
            System.out.println("\nO numero esta fora da faixa de 20 a 90");
        }
        System.out.println("\n");
        input.close();
    }
}
