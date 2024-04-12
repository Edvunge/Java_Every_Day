package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double prest, valor, taxa;
        int tempo;

        System.out.println("digite o valor da prestacao: ");
        valor = input.nextDouble();

        System.out.println("digite a taxa: ");
        taxa = input.nextDouble();

        System.out.println("digite o tempo(numero de meses): ");
        tempo = input.nextInt();

        prest = valor+(valor*(taxa/100)*tempo);
        System.out.println("O Valor da prestacao em atraso: " + prest);
        input.close();
    }
}
