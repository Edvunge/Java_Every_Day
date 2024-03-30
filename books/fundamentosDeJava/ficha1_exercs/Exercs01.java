package books.fundamentosDeJava.ficha1_exercs;

import java.util.Scanner;

public class Exercs01 {
    //  1 - Faça um programa para ler um valor inteiro e que imprima o seu antecessor e
    //  sucessor.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.printf("O %d o seu antecessor: %d\n",num ,antecessor);
        System.out.printf("O %d o seu sucessor: %d\n",num ,sucessor);

        input.close();
    }
}
