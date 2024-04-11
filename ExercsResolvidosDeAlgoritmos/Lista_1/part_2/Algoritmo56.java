package ExercsResolvidosDeAlgoritmos.Lista_1.part_2;

import java.util.Scanner;

public class Algoritmo56 {
    public static void main(String[] args) {
        // Entrar com nome e idade. Imprimir a seguinte saida:
        // nome:
        // idade:
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("digite nome: ");
        nome = input.next();

        System.out.println("digite idade: ");
        idade = input.nextInt();

        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
    }
}
