package ZEDlistaDEexercicios.RandomExercs;

import java.util.Scanner;

public class Exercs01 {
    // Exercs01
    // 1) Receber um nome e imprimir as 4 primeiras letras do nome.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        System.out.println(nome.substring(0, 4)); // E D V A ldo
        input.close();
    }
}
