package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_11_Interface;

public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaPorOperacao = 0.45;

    public void deposita(double valor) {
        this.saldo += valor - this.taxaPorOperacao;
    }

    public void saca(double valor) {
        this.saldo -= valor + this.taxaPorOperacao;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
