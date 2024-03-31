package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        //  4. Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000
        //  em 1000, imprimindo seu valor na tela, ate que seu valor seja 100000 (cem mil).
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(" "+ i);
        }
        input.close();
    }
}
