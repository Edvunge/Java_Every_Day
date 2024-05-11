package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc10 {
    // 10. leia dois números reais e imprima a média aritmética com a mensagem “MÉDIA”
    // antes do resultado.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o primeiro numero real: ");
        double num1 = input.nextDouble();

        System.out.println("digite o primeiro numero real: ");
        double num2 = input.nextDouble();

        double mediaAritmetica = (num1+num2/2);
        System.out.println("MEDIA: " + mediaAritmetica);
    }
}
