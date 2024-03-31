package ZEDlistaDEexercicios.Lista_5_Strings;

import java.util.Scanner;

public class Exerc05 {
    // 5. Digite um nome, calcule e retorne quantas letras tem esse nome.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o seu nome: ");
        String nome = input.nextLine();

        String tamanhoNome = String.valueOf(nome.length());

        input.close();
    }
}
