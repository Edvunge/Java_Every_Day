package ZEDlistaDEexercicios.Lista_5_Strings;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        // 3. Entre com um nome e imprima o nome somente se a primeira letra do nome for ‘a’
        //(maiúscula ou minúscula).
        Scanner input = new Scanner(System.in);

        System.out.println("digite um nome: ");
        String nome = input.nextLine();

        if(nome.contains("a") || nome.contains("A")) {
            System.out.println(nome);
        } else {
            System.out.println("Error! O nome nao contem a letra.");
        }

        input.close();
    }
}
