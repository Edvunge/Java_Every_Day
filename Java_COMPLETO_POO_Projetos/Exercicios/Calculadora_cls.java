package Java_COMPLETO_POO_Projetos.Exercicios;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Calculadora_cls {
    /*
    1. Crie uma classe `Calculadora`
    com métodos para adição, subtração, multiplicação e divisão.
    */

    // ATRIBUTOS:
    public double numer1;
    public double numer2;
    public double soma;
    public double subtraccao;
    public double divisao;
    public double multiplicacao;

    // metodo para somar dois numeros
    void adicao(double numero1, double numero2){
        double sum = (numer1 + numer2);

        System.out.format("A soma de %.1f + %.1f = %.1f\n",numer1 ,numer2 ,sum);
    }

    // metodo para sutrair dois numeros
    void subtracao(double numero1, double numero2){

        if (numer1 > numer2) {
            double subtr = (numer1 - numer2);
            System.out.format("A subtracacao de %.1f - %.1f = %.1f\n",numer1 ,numer2 ,subtr);
        } else  {
            double subtr = (numer2 - numer1);
            System.out.format("A subtracacao de %.1f - %.1f = %.1f\n",numer2 ,numer1 ,subtr);
        }
    }

    // metodo para multiplicar dois numeros
    void multiplicacao(double numero1, double numero2){
        double multiplicar = (numer1 * numer2);

        System.out.format("A multiplicar de %.1f * %.1f = %.1f\n",numer1 ,numer2 ,multiplicar);
    }

    // metodo para dividir dois numeros
    void divisao(double numero1, double numero2){
        double divisao;

        if (numer1 == 0) {
            divisao = (numer1 / numer2);
            System.out.format("A divisao de %.1f / %.1f = %.1f\n",numer1 ,numer2 ,divisao);
        } else  {
            divisao = (numer2 / numer1);
            System.out.format("A divisao de %.1f / %.1f = %.1f\n",numer2 ,numer1 ,divisao);
        }
    }


    public static void main(String[] args) {
        Calculadora_cls calculadora = new Calculadora_cls();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        calculadora.numer1 = num1;

        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        calculadora.numer2 = num2;

        System.out.println("========================| CALCULADORA |=======================\n");
        System.out.println("========== Escolha a operacao, desejada: \n");
        System.out.println("========== Somar (+) \n");
        System.out.println("========== Multiplicar (*) \n");
        System.out.println("========== Dividir (/) \n");
        System.out.println("========== Subtrair (-) \n");
        System.out.println("=========================| ----------- |=========================\n");
        char opcaoDesejada = sc.next().charAt(0);

        switch (opcaoDesejada) {
            case '+':
                calculadora.adicao(calculadora.numer1, calculadora.numer2);
                break;
            case '/':
                calculadora.divisao(calculadora.numer1, calculadora.numer2);
                break;
            case '-':
                calculadora.subtracao(calculadora.numer1, calculadora.numer2);
                break;
            case 'x':
                calculadora.multiplicacao(calculadora.numer1, calculadora.numer2);
                break;
        }
    }
}