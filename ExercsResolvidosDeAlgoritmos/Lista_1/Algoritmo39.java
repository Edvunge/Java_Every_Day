package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo39 {
    public static void main(String[] args) {
        // Entrar com dois numeros reais e imprimir a media aritmetica com a mensagem "media " antes do resultado
        Scanner input = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("digite o valor da 1 nota: ");
        nota1 = input.nextInt();

        System.out.println("digite o valor da 2 nota: ");
        nota2 = input.nextInt();

        media = (nota1+nota2)/2;
        System.out.println("A Media: " + media);
    }
}
