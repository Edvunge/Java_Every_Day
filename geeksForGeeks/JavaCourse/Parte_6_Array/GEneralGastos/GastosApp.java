package geeksForGeeks.JavaCourse.Parte_6_Array.GEneralGastos;

import java.util.Scanner;

public class GastosApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Gastos gastos = new Gastos();
        FontesDeRendas fontesDeRendas = new FontesDeRendas();

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

        System.out.println("digite o valor mensal saldo das telecomunicaoes: ");
        gastos.telecom = input.nextDouble();

        fontesDeRendas.salaryE = input.nextDouble();
        fontesDeRendas.salaryJ = input.nextDouble();
        fontesDeRendas.aulasProg = input.nextDouble();

        gastos.totalGastos();
        fontesDeRendas.totalGanhos();
    }
}
