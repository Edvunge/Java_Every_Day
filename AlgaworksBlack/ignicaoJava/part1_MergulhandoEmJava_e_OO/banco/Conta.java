package AlgaworksBlack.ignicaoJava.part1_MergulhandoEmJava_e_OO.banco;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

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

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
