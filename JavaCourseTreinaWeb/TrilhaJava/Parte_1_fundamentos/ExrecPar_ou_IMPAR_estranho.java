package JavaCourseTreinaWeb.TrilhaJava.Parte_1_fundamentos;

import java.util.Scanner;

public class ExrecPar_ou_IMPAR_estranho {
    public static void main(String[] args) {
        /*
        Dado um valor inteiro N, complete o código abaixo de acordo com as condições:

        Se N for ímpar, exiba no console: "Estranho";
        Se N for par e for menor que 10, exiba no console: "Não é estranho";
        Se N for par e estiver entre 10 e 20, exiba no console: "Estranho";
        Se N for par e for maior que 20, exiba no console: "Não é estranho".
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Estranho.");
        } else if (num % 2 == 0 && num < 10) {
            System.out.println("Nao eh estranho.");
        } else if (num % 2 == 0 & num > 10 & num < 20) {
            System.out.println("Estranho.");
        } else if (num % 2 == 0 && num > 20) {
            System.out.println("Nao eh Estranho.");
        }
        sc.close();
    }
}