package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_14_Heranca_Polimorfismo.entities;

public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate();
    }

    private Double interestRate() {
        return null;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}