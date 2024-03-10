package ZEDlistaDEexercicios.CadernoDeExercicios.C_EXERCICIOS_ESTRUTURA_CONDICIONAL;

import java.util.Scanner;

public class Exerc31 {
    // 31. Faça um algoritmo que leia dois números A e B e imprima o maior deles.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("O %d eh o maior valor: ",num1);
        } else {
            System.out.printf("O %d eh o maior valor: ",num2);
        }
        input.close();
    }
}
