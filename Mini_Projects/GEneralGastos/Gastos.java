package Mini_Projects.GEneralGastos;

public class Gastos {
    // renda, telefMovel, luz, gas, agua, saldoTelef_A, comida, dividas,
    public double renda;
    public double telefMovel;
    public double luz;
    public double gas;
    public double agua;
    public double saldoTelef_A;
    public double saldoTelef_B;
    public double comida;
    public double dividas;
    public double telecom;
    public double bilheteTransporte;
    public double lazer;

    public double totalGastos() {
        double total = this.renda + this.telefMovel +
        this.luz + this.gas + this.agua +
        this.saldoTelef_A + this.saldoTelef_B +
        this.comida + this.dividas + this.telecom +
                this.bilheteTransporte + this.lazer;

        //System.out.printf("\nO total gasto neste Mes foi de: %.2f" , total);
        return total;
    }
}
