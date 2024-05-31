package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula14_15;

import java.util.Scanner;

public class Exerc04_Classificacao_Sexo {
    // 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    //Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = sc.next();

        if(letra.equals("f")) {
            System.out.println("\nF - Feminino");
        } else if(letra.equals("m")) {
            System.out.println("\nM - Masculino");
        } else {
            System.out.println("\nSexo Invalido");
        }
        sc.close();
    }
}