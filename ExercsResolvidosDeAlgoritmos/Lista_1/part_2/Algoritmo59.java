package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;

        System.out.println("Entrar com 1 cateto: ");
        a = input.nextInt();

        System.out.println("Entrar com 2 cateto: ");
        b = input.nextInt();

        System.out.println("Entrar com 3 cateto: ");
        c = input.nextInt();

        a = Math.sqrt(b*2 + c*2);
        System.out.println("A hipotenusa e: " + a);
    }
}
