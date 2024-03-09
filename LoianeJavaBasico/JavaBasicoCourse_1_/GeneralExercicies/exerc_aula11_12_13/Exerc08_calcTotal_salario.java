package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula11_12_13;

import java.util.Scanner;

public class Exerc08_calcTotal_salario {
    // 8. Faça um Programa que pergunte quanto você ganha por hora e o
    //número de horas trabalhadas no mês. Calcule e mostre o total do seu
    //salário no referido mês.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o quanto voce ganha por hora: ");
        double ganhoPorHora = sc.nextDouble();

        System.out.println("Digite o numero de horas trabalhadas: ");
        double numeroDeHorasTrabalhadas = sc.nextDouble();

        double salario = (numeroDeHorasTrabalhadas * ganhoPorHora);

        System.out.println("O valor do salario: " + salario);
        sc.close();
    }
}
