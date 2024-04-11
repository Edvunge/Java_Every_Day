package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f, c;

        System.out.println("digite o valor da temperatura em graus centrigrados: ");
        c = input.nextDouble();

        f = (9 * c + 160)/5;
        System.out.println("o valor da temperatura em graus fahrenheit e = " + f);
    }
}
