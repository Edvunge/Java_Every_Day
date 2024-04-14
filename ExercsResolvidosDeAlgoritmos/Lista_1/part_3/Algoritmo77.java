package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, d, q;

        System.out.println("digite 1 numero: ");
        a = input.nextByte();

        System.out.println("digite 2 numero: ");
        b = input.nextByte();

        d = (a - b)*2;
        q = a*2 - b*2;

        System.out.println("O quadrado da diferenca = " + d + " diferenca dos quadrados = "+ q);
        input.close();
    }
}
