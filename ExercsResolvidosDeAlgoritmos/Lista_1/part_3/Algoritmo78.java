package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nd;
        int n;

        System.out.println("digite o numero de lados do poligono: ");
        n = input.nextInt();

        nd = n * (n - 3) / 2;
        System.out.println("numero de diagonais: " + nd);
        input.close();
    }
}
