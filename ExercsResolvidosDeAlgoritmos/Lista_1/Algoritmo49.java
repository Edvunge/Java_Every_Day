package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int n;

        System.out.println("entre com nome: ");
        nome = input.next();

        System.out.println("todo nome: " + nome);
        System.out.println("primeiro caracter: " + nome.trim());
        System.out.println("ultimo caracter: " + nome.strip());
        System.out.println("primeiro ao terceiro caracter: " + nome.substring(Integer.parseInt(nome), 3));
        System.out.println("quarto caractere: " + nome);
        System.out.println("todos menos o primeiro caracter: " + nome);

         n = nome.codePointAt(-2);

        System.out.println("primeiro ao terceiro caracter: " + nome);

    }
}
