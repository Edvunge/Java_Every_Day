package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1009_SalarioComBonus {
    /*
        Faça um programa que leia o nome de um vendedor,
        o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
        Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
        informar o total a receber no final do mês, com duas casas decimais.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = input.next();

        System.out.println("Digite o seu salario fixo: ");
        double salarioFixo = input.nextDouble();

        System.out.println("Qual foi o total de vendas efetuadas neste mes: ");
        double totalVendasEftuadas = input.nextDouble();

        // 15%
        // totalVendasEftuadas
        double percentagensGanhaPeloUser = (15 * totalVendasEftuadas)/100;
        double totalPorReceber = salarioFixo + percentagensGanhaPeloUser;

        System.out.printf("o total a receber e de: %.2f",totalPorReceber);
    }
}
