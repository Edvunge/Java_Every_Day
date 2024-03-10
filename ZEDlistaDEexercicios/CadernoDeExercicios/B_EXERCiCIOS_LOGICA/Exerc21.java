package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc21 {
    //21. Faça um algoritmo que leia dois valores inteiros (A e B) e apresente o resultado
    //da soma do quadrado de cada valor lido.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primeiro numero: ");
        valor1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        valor2 = input.nextInt();

        int soma = (valor1 + valor2);

        int quadradoDaSoma = (soma * soma);

        System.out.printf("Resultado da soma de quadrado: %d ",quadradoDaSoma);
        input.close();
    }
}
