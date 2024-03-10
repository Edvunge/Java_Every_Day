package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc20 {
    // 20. Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
    //do quadrado da soma dos valores lidos.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primeiro numero: ");
        valor1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        valor2 = input.nextInt();

        int quadrado = (valor1 * valor2);

        int soma = (quadrado + quadrado);

        System.out.printf("Resultado o quadrado da soma: %d ",soma);
        input.close();
    }
}
