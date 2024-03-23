package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

import java.util.Scanner;

public class Exerc05 {
    // 5. Faça um programa que peça ao usuário para digitar 10 valores e some-os.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            int num = input.nextInt();
            soma += num;
        }

        System.out.printf("a soma dos 10 numeros: %d",soma);
        input.close();
    }
}
