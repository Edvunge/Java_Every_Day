package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1004_ProdutoSimples {
    /*

    Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e
    atribua esta operação à variável PROD.
    A seguir mostre a variável PROD com mensagem correspondente.

    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();

        int produto = valor1 * valor2;
        System.out.printf("O produto de %d x %d = %d",valor1 ,valor2 ,produto);
    }
}
