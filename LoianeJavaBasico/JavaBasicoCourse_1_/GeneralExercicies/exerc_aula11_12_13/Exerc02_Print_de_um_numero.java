package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc02_Print_de_um_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2. Faça um Programa que peça um número e então mostre a
        //mensagem O número informado foi [número].

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("o numero digitado: " + num);
        sc.close();
    }
}
