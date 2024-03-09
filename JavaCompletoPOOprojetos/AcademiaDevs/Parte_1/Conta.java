package JavaCompletoPOOprojetos.AcademiaDevs.Parte_1;

public class Conta {
    int numero;
    double saldo;
    double limite = 100;
    Agencia agencia;

    public Conta(Agencia agencia) {
        this.agencia = agencia;
    }

    // ================================================================ METHODOS
    // utilizamos o THIS para acessar e/ou modificar um atributo
    void deposita(double valor) {
        // implementacao
        this.saldo += valor;
    }

    void saca(double valor) {
        this.saldo -= valor;
    }

    void imprimeExtrato() {

        this.imprimeExtrato(15);
    }

    void imprimeExtrato(int dias) {
        // extrato
    }

    double consultaSaldoDisponivel() {

        return this.saldo + this.limite;
    }

    void transfere(Conta destino, double valor) {
        this.saldo -= valor;
        destino.saldo += valor;
    }

}