package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc14 {
    // 14. Faça um algoritmo que calcule e apresente o valor do volume de uma lata de
    // óleo, utilizando a fórmula VOLUME = 3,14159 * RAIO2 * ALTURA.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, altura, volumeLataDeOleo;

        System.out.println("Digite o valor do raio: ");
        raio = input.nextDouble();

        System.out.println("Digite o valor do altura: ");
        altura = input.nextDouble();

        volumeLataDeOleo = (3.14159 * (raio * raio) * altura);

        System.out.printf("O valor do volume de uma lata de oleo: %.2f",volumeLataDeOleo);

        input.close();
    }
}
