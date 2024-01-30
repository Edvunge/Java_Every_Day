package Java_COMPLETO_POO_Projetos.Apostila_java_POO;

public class Conta {
    int numero;
    String titular;
    double saldo;

    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
}
