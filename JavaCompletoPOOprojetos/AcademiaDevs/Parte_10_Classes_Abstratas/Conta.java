package JavaCompletoPOOprojetos.AcademiaDevs.Parte_10_Classes_Abstratas;

public abstract class Conta {
    // Atributos
    // Construtores
    // Metodos
    private double saldo;
   public abstract void imprimeExtratoDetalhado();


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
