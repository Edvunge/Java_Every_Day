package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo46 {
    public static void main(String[] args) {
        // Fazer um algoritmo que possa entrar com o saldo de uma aplicacao e imprima o novo saldo, considerando o reajuste de 1%
        Scanner input = new Scanner(System.in);
        double saldo, nSaldo;

        System.out.println("digite saldo: ");
        saldo = input.nextDouble();

        nSaldo = saldo * 1.01;
        System.out.println("novo saldo: " + nSaldo);
    }
}
