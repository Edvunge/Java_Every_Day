package ZEDlistaDEexercicios.NiumaAulas.aula01;

import ZEDlistaDEexercicios.NiumaAulas.PooBasico.dominio.Carro;

import java.util.Scanner;

public class Exerc02 {
    // 15. Faça um programa em java que permita entrar com a idade de várias pessoas e
    // imprima:
    //• total de pessoas com menos de 21 anos
    //• total de pessoas com mais de 50 anos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalIdadeMenor21 = 0;
        int totalIdadeMaior50 = 0;

        System.out.println("digite o numero de pessoas: ");
        int numeroPessoas = input.nextInt();

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.println("digite a sua idade: ");
            int idade = input.nextInt();

            if(idade <= 21) {
                totalIdadeMenor21++;
            } else if (idade >= 50) {
                totalIdadeMaior50++;
            }
        }

        System.out.println("total das idades menor de 21: " + totalIdadeMenor21);
        System.out.println("total das idades maiores de 50: " + totalIdadeMaior50);
        input.close();
    }
}
