package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula16_17;

import java.util.Scanner;

public class Exerc11 {
    // 11. Altere o programa anterior para mostrar no final a soma dos números.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;

        System.out.println("digite o primeiro numero: ");
        int num1 = input.nextInt();

        System.out.println("digite o seguindo numero: ");
        int num2 = input.nextInt();

        for (int i = num1; i < num2; i++) {
            soma += i;
            System.out.printf(" %d ",i);
        }
        System.out.println("a soma total e de: " + soma);
        input.close();
    }
}
