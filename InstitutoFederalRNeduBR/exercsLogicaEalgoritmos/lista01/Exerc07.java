package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc07 {
    // 7. Leia dois números inteiros e imprima a soma: Antes do resultado, deverá aparecer
    //a mensagem “SOMA”.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primiero numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;
        System.out.println("SOMA: " + soma);
    }
}
