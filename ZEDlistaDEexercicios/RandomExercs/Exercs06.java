package ZEDlistaDEexercicios.RandomExercs;

import java.util.Scanner;

public class Exercs06 {
    public static void main(String[] args) {
        //  6) Ler nome, sexo e idade. Se sexo for feminino e idade menor que 25.
        //  Imprimir o nome da pessoa
        //  e a palavra ACEITA. Caso contrario imprimir NAO ACEITA.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o seu sexo: ");
        String sexo = input.nextLine();

        System.out.println("Digite a sua Idade: ");
        int idade = input.nextInt();

        if (sexo.equals("feminino") && idade > 25) {
            System.out.println("O seu nome: " + nome);
            System.out.println("==== ACEITE ====");
        } else {
            System.out.println("==== NAO-ACEITE ====");
        }
        input.close();
    }
}
