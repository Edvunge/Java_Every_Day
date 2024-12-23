package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1007_Diferenca {
    /*
    Leia quatro valores inteiros A, B, C e D. A seguir, calcule e
    mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros: ");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int valor4 = input.nextInt();

        int diferenca = (valor1 * valor2 - valor3 * valor4);
        System.out.printf("A diferenca do produto: %d, %d pelo produto: %d, %d \neh igual %d",valor1,valor2,valor3,valor4,diferenca);
    }
}
