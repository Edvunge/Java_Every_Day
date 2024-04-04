package ZEDlistaDEexercicios.RandomExercs;

import java.util.Scanner;

public class Exercs07 {
    // 7) Digite um nome , calcule e mostre quantas letras tem.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o seu nome: ");
        String nome = input.next();

        System.out.println(nome + " tem " + nome.length() + " letras.");

        input.close();
    }
}
