package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quant;
        double valAluguel, fatAnual, multas, quantFinal;

        System.out.println("digite a quantidade de fitas: ");
        quant = input.nextInt();

        System.out.println("digite o valor do aluguel: ");
        valAluguel = input.nextDouble();

        fatAnual = quant/3 * valAluguel*12;

        System.out.println("faturamento anual: " + fatAnual);
        multas = valAluguel*0.1* (quant/3)/10;
        System.out.println("Multas mensais: " + multas);

        quantFinal = quant - quant * 0.02 + quant/10;
        System.out.println("quantidade de fitas do final do ano: " + quantFinal);
        input.close();
    }
}
