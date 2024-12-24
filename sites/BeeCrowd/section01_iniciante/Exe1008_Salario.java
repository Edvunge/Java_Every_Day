package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1008_Salario {
    /*
    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
    o valor que recebe por hora e calcula o salário desse funcionário.
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int numerFuncionario = input.nextInt();

        System.out.println("Digite o numero de horas trabalhadas: ");
        int numerHorasTrabalhadas = input.nextInt();

        System.out.println("Digite o valor para cada horas trabalhadas: ");
        double valorPorHoraTrabalhados = input.nextDouble();

        // salario = horastrab*VALORpORHORAS
        double salario = (valorPorHoraTrabalhados * numerHorasTrabalhadas);
        System.out.println("salario: "+salario);
    }
}
