package LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.test;

import LoianeJavaBasico.JavaBasicoCourse_1_.GeneralExercicies.exerc_aula24.dominio.Conta;

public class TestaConta {
    // 5. Cria uma classe para representar uma conta corrente que possui um
    // número, um saldo, um status que informa se ela é especial ou não, um limite.
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.numeroDaConta = 32123;
        conta.saldo = 123.45;
        conta.limite = "Infinito";
        conta.status = "Conta Black";

        System.out.println("Numero da Conta: " + conta.numeroDaConta);
        System.out.println("Saldo da Conta: " + conta.saldo);
        System.out.println("Limite da Conta: " + conta.limite);
        System.out.println("Tipo de Conta: " + conta.status);
    }
}