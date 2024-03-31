package ZEDlistaDEexercicios.Lista_5_Strings;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        // 1. Faça um programa que então leia uma string e a imprima.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine();

        System.out.println(palavra);

        input.close();
    }
}
