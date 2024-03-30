package books.fundamentosDeJava.ficha3_exercs;

import java.util.Scanner;

public class Exercs01 {
    //  1 Construa um programa que apresente o peso total que será carregado por um
    //  caminhão. Sabe-se que esse caminhão carrega 25 caixas, com pesos diferentes. Será
    //  entrada do programa o peso (P) de cada uma das caixas.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite um valor: ");
            int num = input.nextInt();
            soma += num;
        }
        System.out.println("o total de carregamento eh: " + soma);
        input.close();
    }
}
