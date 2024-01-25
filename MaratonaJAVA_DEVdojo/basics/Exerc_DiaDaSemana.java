package MaratonaJAVA_DEVdojo.basics;

import java.util.Scanner;

public class Exerc_DiaDaSemana {
    // 13. Faça um Programa que leia um número e exiba o dia correspondente
    //da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
    //aparecer valor inválido.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int diaDaSemana = sc.nextInt();

        if(diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if(diaDaSemana == 2) {
            System.out.println("Segunda feira");
        } else if(diaDaSemana == 3) {
            System.out.println("Terca Feira");
        } else if(diaDaSemana == 4) {
            System.out.println("Quarta feira");
        } else if(diaDaSemana == 5) {
            System.out.println("Quinta feira");
        } else if(diaDaSemana == 6) {
            System.out.println("Sexta feira");
        } else if(diaDaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Numero Inválido");
        }
        sc.close();
    }
}
