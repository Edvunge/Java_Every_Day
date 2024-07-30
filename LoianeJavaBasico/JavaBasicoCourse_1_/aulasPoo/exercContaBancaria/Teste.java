package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.exercContaBancaria;

public class Teste {
    public static void main(String[] args) {

        System.out.println("***** Teste Conta Bancaria *****");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("111111");

        System.out.println(contaSimples);
    }
}
