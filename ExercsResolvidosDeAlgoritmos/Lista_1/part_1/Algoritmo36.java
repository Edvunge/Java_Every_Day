package ExercsResolvidosDeAlgoritmos.Lista_1.part_1;

import java.util.Scanner;

public class Algoritmo36 {
    public static void main(String[] args) {
        // ler dois numeros inteiros e imprimir a soma ,
        // antes do resultado, deverá aparecer a mensagem: Soma
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num = input.nextInt();

        System.out.println("digite um outro numero: ");
        int num1 = input.nextInt();

        int soma = (num + num1);

        System.out.println("a soma: " + soma);

        input.close();
    }
}
