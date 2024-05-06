 package Mini_Projects.GEneralGastos;

import java.util.Scanner;

public class GastosApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gastos gastos = new Gastos();
        FontesDeRendas fontesDeRendas = new FontesDeRendas();
        ValorSobrante valorSobrante = new ValorSobrante();

        // inputs da classe gastos
        System.out.println("Digite o valor mensal da comida:");
        gastos.comida = input.nextDouble();

        System.out.println("digite o valor mensal das dividas: ");
        gastos.dividas = input.nextDouble();

        System.out.println("digite o valor mensal da renda: ");
        gastos.renda = input.nextDouble();

        System.out.println("digite o valor mensal da agua: ");
        gastos.agua = input.nextDouble();

        System.out.println("digite o valor mensal do gas: ");
        gastos.gas = input.nextDouble();

        System.out.println("digite o valor mensal da luz: ");
        gastos.luz = input.nextDouble();

        System.out.println("digite o valor mensal saldo telefone_A: ");
        gastos.saldoTelef_A = input.nextDouble();

        System.out.println("digite o valor mensal saldo telefone_B: ");
        gastos.saldoTelef_B = input.nextDouble();

        System.out.println("digite o valor mensal saldo telefMovel: ");
        gastos.telefMovel = input.nextDouble();

        System.out.println("digite o valor mensal das telecomunicaoes: ");
        gastos.telecom = input.nextDouble();

        System.out.println("digite o valor mensal do bilhete de transporte: ");
        gastos.bilheteTransporte = input.nextDouble();

        System.out.println("digite o valor mensal do lazer: ");
        gastos.lazer = input.nextDouble();


        // inputs da classe fontes de renda
        System.out.println("Qual eh o salario do E: ");
        fontesDeRendas.salaryE = input.nextDouble();

        System.out.println("Qual eh o salario da J: ");
        fontesDeRendas.salaryJ = input.nextDouble();

        System.out.println("Qual eh valor ganho das aulas de progr: ");
        fontesDeRendas.aulasProg = input.nextDouble();

        double resultanteDosGastos;

        if (gastos.totalGastos() > fontesDeRendas.totalGanhos()) {
            resultanteDosGastos = gastos.totalGastos() - fontesDeRendas.totalGanhos();

            System.out.printf("\nO Total gasto neste Mes foi de: %.2f" , gastos.totalGastos());
            System.out.printf("\nO Total de Ganhos neste Mes foi de: %.2f", fontesDeRendas.totalGanhos());
            System.out.println("\nA Resultante dos Gastos: " + resultanteDosGastos);
        } else {
            resultanteDosGastos = fontesDeRendas.totalGanhos() - gastos.totalGastos();

            System.out.printf("\nO Total gasto neste Mes foi de: %.2f" , gastos.totalGastos());
            System.out.printf("\nO Total de Ganhos neste Mes foi de: %.2f", fontesDeRendas.totalGanhos());
            System.out.println("\nA Resultante dos Gastos: " + resultanteDosGastos);
        }
    }
}
