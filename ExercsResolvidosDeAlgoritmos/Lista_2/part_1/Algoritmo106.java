package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome, letra;

        System.out.println("\nDigite o seu nome: ");
        nome = input.next();

        letra = nome.strip();

        if (letra.equals("A") || letra.equals("a")) {
            System.out.println("\n" + nome);
        }
        System.out.println("\n");
    }
}
