package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo38 {
    public static void main(String[] args) {
        // ler um numero real e imprimir a terca parte deste numero
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        double num = input.nextInt();

        double tercaParte = num/3;
        System.out.println("A terca parte eh: " + tercaParte);
    }
}
