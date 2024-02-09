package Java_COMPLETO_POO_Projetos.Apostila_java_POO;

public class Conta {
    int numero;
    String titular;
    double saldo;

    boolean saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
        return false;
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
}
