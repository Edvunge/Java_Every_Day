package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

import java.util.Scanner;

public class Exerc07 {
    // 7. Faça um programa que leia 10 inteiros positivos, ignorando não positivos, e imprima sua média.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0, media = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d numero: ",i);
            int num = input.nextInt();

            if ( num < 0) {
                soma += num;
            }
        }
        media = (soma/10);
        System.out.printf("A media dos 10 numeros nao positivos: %.2f",media);
        input.close();
    }
}
