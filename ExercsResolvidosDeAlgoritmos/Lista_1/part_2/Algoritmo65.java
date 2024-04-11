package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double volume, altura, raio;

        System.out.println("digite a altura da lata: ");
        altura = input.nextDouble();

        System.out.println("digite a raio da lata: ");
        raio = input.nextDouble();

        volume = Math.PI * raio * 2 * altura;
        System.out.println("O volume da lata e = " + volume);
    }
}
