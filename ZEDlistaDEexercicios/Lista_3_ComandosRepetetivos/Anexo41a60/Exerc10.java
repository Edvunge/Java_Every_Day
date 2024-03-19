package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo41a60;

import java.util.Scanner;

public class Exerc10 {
    // 10. Faca um programa que calcule e mostre a soma dos 50 primeiros numeros pares.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMRS = 50;
        int soma = 0;

        for (int i = 0; i < NUMRS; i++){
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.printf("A Soma dos primeiros 50 pares eh: %d ",soma);
        input.close();
    }
}
