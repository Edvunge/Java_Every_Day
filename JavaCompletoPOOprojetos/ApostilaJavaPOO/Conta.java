package JavaCompletoPOOprojetos.ApostilaJavaPOO;

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
