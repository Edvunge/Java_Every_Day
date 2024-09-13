package ESTUDOS;

import java.util.Scanner;

public class Calc_Investimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor que pretendes investir: ");
        float valorPorInvestir = input.nextFloat();

        System.out.println("Digite o valor do rendimento anual Da - OBRIGATION: ");
        float rendimentoAnnual = input.nextFloat();

        float valorDoGanho = ( (rendimentoAnnual * valorPorInvestir) / 100 );
        float ganho = valorPorInvestir + valorDoGanho;
        float ganhoSemAcrescimoDoVencimento = ganho - valorPorInvestir;

        System.out.println();
        System.out.printf("VALOR INVESTIDO: %.2f \n" , valorPorInvestir);
        System.out.printf("GANHO ANUAL: %.2f \n" , ganhoSemAcrescimoDoVencimento);
        System.out.printf("GANHO ANUAL + VALOR DO INVESTIMENTO: %.2f \n" , ganho);
    }
}
