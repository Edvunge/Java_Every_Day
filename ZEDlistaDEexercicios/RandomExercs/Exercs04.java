package ZEDlistaDEexercicios.RandomExercs;

import java.util.Scanner;

public class Exercs04 {
    // Exercs04
    // 4) Escrever seu nome na tela 10 vezes. Um nome por linha.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
        input.close();
    }
}
