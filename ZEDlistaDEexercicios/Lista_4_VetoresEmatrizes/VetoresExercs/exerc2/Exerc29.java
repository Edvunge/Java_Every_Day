package ZEDlistaDEexercicios.Lista_4_VetoresEmatrizes.VetoresExercs.exerc2;

import java.util.Scanner;

public class Exerc29 {
    /*
    29. Faca um programa que receba 6 numeros inteiros e mostre:
        • Os numeros pares digitados;
        • A soma dos numeros pares digitados;
        • Os numeros ımpares digitados;
        • A quantidade de numeros ımpares digitados;
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int LEN = 6;
        int[] numrs = new int[LEN];
        int somaDosParesDigitados = 0;
        int numrsImparesDigitados = 0;

        for (int i = 0; i < LEN; i++) {
            System.out.printf("Digite um valor para posicao {%d}: ", i);
            numrs[i] = input.nextInt();
        }

        System.out.println("Os numeros pares digitados");
        for (int z = 0; z < LEN; z++) {
            // Os numeros pares digitados;
            if (numrs[z] % 2 == 0) {
                System.out.print(" "+ numrs[z]);
                somaDosParesDigitados += numrs[z];
            } else {
                // Os numeros ımpares digitados;
                numrsImparesDigitados = numrs[z];
            }
        }

        // A soma dos numeros pares digitados;
        System.out.printf("\nA soma dos numeros digitados: "+ somaDosParesDigitados);

        // Os numeros ımpares digitados;
        System.out.printf("\nNumeros Impares digitados: "+ numrsImparesDigitados);

        // A quantidade de numeros ımpares digitados;
    }
}
