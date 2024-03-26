package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

import java.util.Scanner;

public class Exerc17 {
    //  17. Faça um programa que leia um número inteiro positivo n e calcule a soma dos n primeiros
    //  números naturais.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;

        System.out.println("leia um numero inteiro: ");
        int numN = input.nextInt();

        for (int i = 0; i < numN; i++) {
            soma += numN;
        }

        System.out.println("soma dos n numeros: " + soma);
        input.close();
    }
}
