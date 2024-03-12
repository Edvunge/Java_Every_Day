package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

import java.util.Scanner;

public class Exerc97 {
    public static void main(String[] args) {
        //  97. Faça um algoritmo que leia um número e imprima a sua tabela de multiplicação
        //  de 1 até 13.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor qualquer: ");
        int num = input.nextInt();

        for(int i = 1; i <= 13; i++) {
            System.out.printf("%d X %d = %d\n",i ,num ,i*num);
        }
        input.close();
    }
}
