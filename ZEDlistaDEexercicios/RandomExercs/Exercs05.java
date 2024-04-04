package ZEDlistaDEexercicios.RandomExercs;

import java.util.Scanner;

public class Exercs05 {
    public static void main(String[] args) {
        // Exercs05
        // 5) Ler nome, endereço, telefone e imprimir
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o seu Endereço: ");
        String endereco = input.nextLine();

        System.out.println("Digite o seu Telefone: ");
        String telefone = input.nextLine();

        System.out.println("\n========= Dados do USER =========");
        System.out.println("O seu nome: " + nome);
        System.out.println("A sua morada: " + endereco);
        System.out.println("O seu telefone: " + telefone);
        input.close();
    }
}
