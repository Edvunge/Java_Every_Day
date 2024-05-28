package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_4_basicoPOO.Exercs;

public class Conta {
    String nomeDoTitular;
    int numeroDaConta;
    String agencia;
    double saldo;
    String dataDeAbertura;

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double calculaRendimento() {
        saldo = saldo * 0.1;
        return saldo;
    }
}
