package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc15 {
    // 15. leia dois números e imprima o resto da divisão entre eles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor: ");
        double num1 = sc.nextDouble();

        System.out.println("digite um outro valor: ");
        double num2 = sc.nextDouble();

        double resto = num1 % num2;
        System.out.println("resto: " + resto);
    }
}
