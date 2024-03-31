package books.fundamentosDeJava.ficha3_exercs;

import java.util.Scanner;

public class Exerc16 {
    //  16. Construa um programa que leia o ano de nascimento de uma pessoa (AN) e mostre a
    //  sua idade e, também verifique e mostre se essa pessoa já tem idade para votar (18 anos
    //  ou mais) e se já pode conseguir o seu bilhete de identidade (18 anos ou mais).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int yearThis = 2024;

        System.out.println("digite o ano de nascimento: ");
        int yearBorn = input.nextInt();

        int age = yearThis - yearBorn;

        if (age > 18) {
            System.out.println("ja possui idade para ter bilhete de identidade");
        } else {
            System.out.println("ainda nao possui idade para ter bilhete de identidade");
        }
        input.close();
    }
}
