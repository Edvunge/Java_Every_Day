package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc06 {
    // 6. leia um numero real e imprima a terça parte deste número.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero real: ");
        double num = input.nextDouble();

        double tercaParte = num/3;
        System.out.println("A Terca parte do num: " + num + " eh " + tercaParte);
    }
}
