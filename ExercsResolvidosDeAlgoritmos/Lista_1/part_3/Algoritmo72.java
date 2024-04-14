package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double deposito, taxa, valor, total;

        System.out.println("entre com deposito: ");
        deposito = input.nextDouble();

        System.out.println("entre com a taxa de juros: ");
        taxa = input.nextDouble();

        valor = deposito*taxa/100;
        total = deposito + valor;
        System.out.println("Rendimentos: " + valor + " total " + total);
        input.close();
    }
}
