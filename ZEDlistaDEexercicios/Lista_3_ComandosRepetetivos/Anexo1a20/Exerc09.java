package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

import java.util.Scanner;

public class Exerc09 {
    // 9. Faca um programa que leia um numero inteiro N e depois imprima os N primeiros
    // numeros naturais ımpares.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int nNumeros = input.nextInt();

        for (int i = 0; i < nNumeros; i++) {
            if (nNumeros % 2 != 0) {
                System.out.println("====== Numeros Impares ======");
                System.out.println(" " + i);
            }
        }
    }
}
