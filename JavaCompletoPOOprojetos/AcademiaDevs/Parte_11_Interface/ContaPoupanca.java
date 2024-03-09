package JavaCompletoPOOprojetos.AcademiaDevs.Parte_11_Interface;

public class ContaPoupanca implements Conta{
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
