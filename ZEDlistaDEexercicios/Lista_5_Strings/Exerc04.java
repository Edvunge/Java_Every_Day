package ZEDlistaDEexercicios.Lista_5_Strings;

import java.util.Scanner;

public class Exerc04 {
    // 4. faça um programa que leia um nome e imprima as 4 primeiras letras do nome.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um nome: ");
        String nome = input.nextLine();

        System.out.println(nome.substring(0, 4));

        input.close();
    }
}
