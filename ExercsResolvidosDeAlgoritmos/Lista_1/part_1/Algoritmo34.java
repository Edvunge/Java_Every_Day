package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo34 {
    public static void main(String[] args) {
        // ler um numero inteiro e imprimir seu sucessor e seu antecessor
        Scanner input = new Scanner(System.in);
        int numero, suc, ant;

        System.out.println("entre com um numero: ");
        numero = input.nextInt();

        ant = numero - 1;
        suc = numero + 1;

        System.out.println("o sucessor e b " + suc + " b o antesecessor e b " + ant);
        System.out.println(" ");
    }
}
