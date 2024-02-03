package Java_COMPLETO_POO_Projetos.Exercicios;

public class ContaBancaria {
    /*
    5. Crie uma classe `ContaBancaria` com atributos saldo e número da conta.
    Adicione métodos para depositar e sacar dinheiro.
    */
    double saldo;
    int numeroDaConta;
    double saldoFinal;

    double depositar(double saldo, int numeroDaConta){

        if(numeroDaConta == 1243){
            saldo = 234;
            System.out.format("valor depositado: %f Euros",saldo);
            return saldo;
        } else if(numeroDaConta == 2134){
            saldo = 342;
            System.out.format("valor depositado: %f Euros",saldo);
            return saldo;
        } else if(numeroDaConta == 3421){
            saldo = 432;
            System.out.format("valor depositado: %f Euros",saldo);
            return saldo;
        }
        return saldo;
    }

    void sacarDinheiro(){
        this.saldoFinal = 9;
    }
}
/*
import java.util.Scanner;

public class ExemploMetodos {

    // Método para obter um valor escolhido pelo usuário
    public static int obterValorDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor = scanner.nextInt();
        return valor;
    }

    // Método que recebe um valor e realiza alguma operação
    public static void realizarOperacao(int valor) {
        int resultado = valor * 2;
        System.out.println("O dobro do valor escolhido é: " + resultado);
    }

    public static void main(String[] args) {
        // Chama o método para obter o valor do usuário
        int valorEscolhido = obterValorDoUsuario();

        // Chama o método para realizar uma operação com o valor escolhido
        realizarOperacao(valorEscolhido);
    }
}

 */