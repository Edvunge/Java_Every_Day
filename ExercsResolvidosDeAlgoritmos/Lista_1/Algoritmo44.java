package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo44 {
    public static void main(String[] args) {
        // Entrar com o numero e a bsae em que se deseja calcular o logaritmo desse numero e imprimi-lo:
        Scanner input = new Scanner(System.in);
        double num, base, logaritmo;

        System.out.println("entre com o logaritmando: ");
        num = input.nextDouble();

        System.out.println("entre com a base: ");
        base = input.nextDouble();

        logaritmo = (Math.log(num) / Math.log(base));
        System.out.println("O logaritmo deb " + num + " baseB " + base + " :b " + logaritmo);
    }
}
