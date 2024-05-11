package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc09 {
    // 9. leia um número inteiro e imprima seu sucesso e seu antecessor.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int num = input.nextInt();

        int sucessor = num + 1;
        int antecessor = num - 1;

        System.out.println("O sucessor   do numero: " + num + " eh " + sucessor);
        System.out.println("O antecessor do numero: " + num + " eh " + antecessor);
    }
}
