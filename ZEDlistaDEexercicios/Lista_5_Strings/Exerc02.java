package ZEDlistaDEexercicios.Lista_5_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        // 2. Crie um programa que calcula o comprimento de uma string.
        Scanner input = new Scanner(System.in);

        System.out.println("digite um valor qualquer");
        String value = input.nextLine();

        System.out.println(value.length());

        input.close();
    }
}
