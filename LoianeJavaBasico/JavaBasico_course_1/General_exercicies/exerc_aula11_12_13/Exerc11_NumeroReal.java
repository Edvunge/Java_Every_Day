package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc11_NumeroReal {
    // 11.Faça um Programa que peça 2 números inteiros e um número real.
    //Calcule e mostre:
    //  a. o produto do dobro do primeiro com metade do segundo.
    //  b. a soma do triplo do primeiro com o terceiro.
    //  c. o terceiro elevado ao cubo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        //  a. o produto do dobro do primeiro com metade do segundo.
        int produto = (num1 * (num2/2));
        System.out.println("\nProduto: " + produto);


        //  b. a soma do triplo do primeiro com o terceiro.
        int soma = ( (num1 * num1 * num1) + num2 );
        System.out.println("\nSoma: " + soma);


        //  c. o terceiro elevado ao cubo.
        int res = (num2 * num2 * num2);
        System.out.println("\nRes: " + res);

        sc.close();
    }
}