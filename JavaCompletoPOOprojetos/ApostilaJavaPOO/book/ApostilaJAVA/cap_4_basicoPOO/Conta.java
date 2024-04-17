package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_4_basicoPOO;

public class Conta {
    public int numero;
    public String titular;
    public double saldo;

    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
}
