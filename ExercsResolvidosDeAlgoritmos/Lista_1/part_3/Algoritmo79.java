package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double va, i, p;
        int n;

        System.out.println("digite o valor da aplicacao: ");
        p = input.nextDouble();

        System.out.println("digite a taxa(0 - 1): ");
        i = input.nextDouble();

        System.out.println("digite o numero de meses: ");
        n = input.nextInt();

        va = p*(((1+i)* n)-1) / i;
        System.out.println("O valor acumulado: " + va);
        input.close();
    }
}
