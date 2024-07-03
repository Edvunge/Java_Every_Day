package AlgaworksBlack.ignicaoJava.part1_MergulhandoEmJava_e_OO.banco;

public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    Conta(Pessoa titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalStateException("valor deve ser maior que 0");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalStateException("valor deve ser maior que 0");
        }

        if (saldo - valor < 0) {
            throw new IllegalStateException("saldo insuficiente");
        }
        saldo = saldo - valor;

    }
}
