package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc05 {
    // 5. leia dois números inteiros e imprima-os.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero");
        int num = input.nextInt();

        System.out.println("digite um outro numero");
        int num2 = input.nextInt();

        System.out.println("primeiro numero: " + num);
        System.out.println("segundo numero: " + num2);
    }
}
