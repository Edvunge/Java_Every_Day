package ExercsResolvidosDeAlgoritmos.Lista_2.part_2;

import java.util.Scanner;

public class Algoritmo129 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, desconto;

        System.out.println("\ndigite salario: \n");
        salario = input.nextDouble();

        if (salario <= 600) {
            desconto = 0;
        } else {
            if (salario <= 2000) {
                desconto = salario * 0.2;
            } else {
                desconto = salario * 0.30;
            }
        }
        System.out.println("\bdesconto: " + desconto);
        System.out.println("\n");
    }
}
