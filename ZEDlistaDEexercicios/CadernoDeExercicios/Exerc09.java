package ZEDlistaDEexercicios.CadernoDeExercicios;

import java.util.Scanner;

public class Exerc09 {
    // 9. Faça um algoritmo que:
    // a) Leia o nome;
    // b) Leia o sobrenome;
    // c) Concatene o nome com o sobrenome;
    // d) Apresente o nome completo.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        System.out.println("Digite o seu sobreNome: ");
        String sobreNome = input.next();

        String nomeCompleto = nome + " " + sobreNome;
        System.out.println(nomeCompleto);
        input.close();
    }
}
