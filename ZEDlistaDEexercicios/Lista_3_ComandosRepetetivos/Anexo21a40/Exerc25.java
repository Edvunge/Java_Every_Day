package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo21a40;

import java.util.Scanner;

public class Exerc25 {
    // 25. Faça um programa que some todos os números naturais abaixo de 1000 que são múltiplos de 3 ou 5.
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0  || i % 5 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos multiplos de 3 e 5 abaixo de 1000 eh: " + soma);
    }
}
