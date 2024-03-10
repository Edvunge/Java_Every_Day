package ZEDlistaDEexercicios.CadernoDeExercicios;

import java.util.Scanner;

public class Exerc11 {
    // 11. Faça um algoritmo que:
    //  a) Obtenha o valor para a variável HT (horas trabalhadas no mês);
    //  b) Obtenha o valor para a variável VH (valor hora trabalhada):
    //  c) Obtenha o valor para a variável PD (percentual de desconto);
    //  d) Calcule o salário bruto => SB = HT * VH;
    //  e) Calcule o total de desconto => TD = (PD/100)*SB;
    //  f) Calcule o salário líquido => SL = SB – TD;
    //  g) Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, SalárioLiquido.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hourasTrabalhadas;
        double valorPorHorasTrabalhadas, totalDeDesconto;
        double percentualDeDesconto, salarioBruto, salarioLiquido;

        System.out.println("Digite o numero de horaas trabalhadas no mes: ");
        hourasTrabalhadas = input.nextInt();

        System.out.println("valor por hora: ");
        valorPorHorasTrabalhadas = input.nextDouble();

        System.out.println("digite o percentual de desconto: ");
        percentualDeDesconto = input.nextDouble();

        salarioBruto = (hourasTrabalhadas * valorPorHorasTrabalhadas);

        totalDeDesconto = (percentualDeDesconto/100)*salarioBruto;
        salarioLiquido = salarioBruto - totalDeDesconto;

        System.out.printf("\nvalor de horas trabalhadas: %d",hourasTrabalhadas);
        System.out.printf("\nvalor por horas trabalhadas: %.2f",valorPorHorasTrabalhadas);
        System.out.printf("\nvalor do percentual de descontos: %.2f",percentualDeDesconto);
        System.out.printf("\nvalor do salario bruto: %.2f",salarioBruto);
        System.out.printf("\nvalor total de desconto: %.2f",totalDeDesconto);
        System.out.printf("\nvalor do salario liquido: %.2f",salarioLiquido);
        input.close();
    }
}
