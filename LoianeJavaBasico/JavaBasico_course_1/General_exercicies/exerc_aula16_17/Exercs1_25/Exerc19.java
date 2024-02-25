package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {
        // 19. Altere o programa anterior para que ele aceite apenas números entre 0
        //e 1000.

        Scanner input = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int soma = 0;
        int numN;

        do {
            System.out.println("Digite um numero: ");
            numN = input.nextInt();

            if (numN > 0 && numN < 1000) {
                if (numN > maxValue) {
                    maxValue = numN;
                }
                if (numN < minValue) {
                    minValue = numN;
                }
                soma += numN;
            } else {
                System.out.println("Número fora do intervalo permitido. Digite novamente.");
            }
        } while (numN >= 0 && numN <= 1000);

        System.out.println("O maior valor: " + maxValue);
        System.out.println("O menor valor: " + minValue);
        System.out.println("A soma: " + soma);
        input.close();
    }
}
