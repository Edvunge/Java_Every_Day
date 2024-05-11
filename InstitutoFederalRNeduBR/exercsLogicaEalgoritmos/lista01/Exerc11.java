package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc11 {
    // 11. calcule e imprima a área de um triângulo.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da Base: ");
        double base = input.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double altura = input.nextDouble();

        double area = base * altura/2;
        System.out.println("O valor da area do triangulo eh: " + area);
        input.close();
    }
}
