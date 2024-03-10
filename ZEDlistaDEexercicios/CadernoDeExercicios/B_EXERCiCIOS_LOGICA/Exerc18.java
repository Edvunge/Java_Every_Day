package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc18 {
    // 18. Faça um algoritmo que leia os valores de COMPRIMENTO, LARGURA e
    // ALTURA e apresente o valor do volume de uma caixa retangular.
    // Utilize para o cálculo a fórmula VOLUME = COMPRIMENTO * LARGURA * ALTURA.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento: ");
        double comprimento = input.nextDouble();

        System.out.println("Digite a largura: ");
        double largura = input.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = input.nextDouble();

        double volume = (comprimento * largura * altura);

        System.out.printf("O volume: %.2f ",volume);
        input.close();
    }
}
