package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1010_CalculoSimples {
    /*
        Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
        o valor unitário de cada peça 1, o código de uma peça 2,
        o número de peças 2 e o valor unitário de cada peça 2.
        Após, calcule e mostre o valor a ser pago.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // calculo 1
        System.out.println("Digite o qual e o codigo de uma peça: ");
        int codigoDeUmaPeca_1 = input.nextInt();

        System.out.println("Digite o valor do numero de peças: ");
        int numeroDePeca_1 = input.nextInt();

        System.out.println("Digite o valor de cada peça: ");
        double valorDeCadaPeca_1 = input.nextDouble();

        // calculo 1
        System.out.println("Digite o qual e o codigo de uma peça: ");
        int codigoDeUmaPeca_2 = input.nextInt();

        System.out.println("Digite o valor do numero de peças: ");
        int numeroDePeca_2 = input.nextInt();

        System.out.println("Digite o valor de cada peça: ");
        double valorDeCadaPeca_2 = input.nextDouble();

        double valorFinal =  ((valorDeCadaPeca_1 * numeroDePeca_1) + (valorDeCadaPeca_2 * numeroDePeca_2));

        System.out.printf("VALOR A PAGAR: %.2f",valorFinal);
    }
}
