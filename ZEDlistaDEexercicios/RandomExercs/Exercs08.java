package ZEDlistaDEexercicios.RandomExercs;

import java.util.Scanner;

public class Exercs08 {
    // 8) Receber do teclado um nome e imprimir tantas vezes quantos forem seus caracteres.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome);
        }
        input.close();
    }
}
