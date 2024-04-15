package ExercsResolvidosDeAlgoritmos.Lista_2;

import java.util.Scanner;

public class Algoritmo98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sb, vp;

        System.out.println("\ndigite o salario: ");
        sb = input.nextInt();

        System.out.println("\ndigite o valor da prestacao: ");
        vp = input.nextInt();

        if (vp <= 0.3 *sb) {
            System.out.println("\nemprestimo concedido");
        } else {
            System.out.println("\nemprestimo negado");
        }
        System.out.println("\n");
        input.close();
    }
}
