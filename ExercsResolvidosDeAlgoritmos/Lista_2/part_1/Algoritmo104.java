package ExercsResolvidosDeAlgoritmos.Lista_2.part_1;

import java.util.Scanner;

public class Algoritmo104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        String nome, sexo;

        System.out.println("\nDigite nome: ");
        nome = input.next();

        System.out.println("\nDigite o seu sexo: ");
        sexo = input.next();

        System.out.println("\nDigite a sua idade: ");
        idade = input.nextInt();

        if (sexo.equals("F") || sexo.equals("f") && idade < 25 ) {
            System.out.println("\n" + nome + " ACEITA");
        } else {
            System.out.println("\n" + nome + " ACEITA");
        }
        System.out.println("\n");
        input.close();
    }
}
