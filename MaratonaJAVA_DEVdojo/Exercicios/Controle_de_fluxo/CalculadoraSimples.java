package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Scanner;

public class CalculadoraSimples {
    // Calculadora Simples:
    //Crie uma calculadora simples que realiza operações básicas (+, -, *, /) com dois números.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma, subt, mult, divisao;

        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("===================   CALCULADORA SIMPLES         ====================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");


        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num1 = sc.nextInt();


        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("\nEscolha um numero que representa uma operacao:\n");
        System.out.println("(1- soma , 2- subtraccao , 3- divisao , 4-multiplicaacao) \n");
        int operacao = sc.nextInt();
        System.out.println("======================================================================");
        System.out.println("======================================================================");


        if(operacao == 1) {
            soma = num + num1;
            System.out.println("o " + num + " somando ao " + num1 + " = " + soma);
        } else if(operacao == 4) {
            mult = num * num1;
            System.out.println("o " + num + " multiplicado ao " + num1 + " = " + mult);
        } else if (operacao == 2) {
            if (num > num1) {
                subt = num + num1;
                System.out.println("o " + num + " subtraido por " + num1 + " = " + subt);
            } else {
                subt = num1 + num;
                System.out.println("o " + num1 + " subtraido por " + num + " = " + subt);
            }
        } else if (operacao == 3) {
            if (num == 0) {
                divisao = num / num1;
                System.out.println("o " + num1 + " dividido por " + num + " = " + divisao);
            } else {
                divisao = num1 / num;
                System.out.println("o " + num + " dividido por " + num1 + " = " + divisao);
            }
        }
        sc.close();
    }
}
