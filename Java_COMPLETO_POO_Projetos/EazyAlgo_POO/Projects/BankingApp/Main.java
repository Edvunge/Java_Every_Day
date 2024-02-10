package Java_COMPLETO_POO_Projetos.EazyAlgo_POO.Projects.BankingApp;

public class Main {
    public static void main(String[] args) {
        Account edvaldoAccount = new Account("12345", 0.0, "Edvaldo", "edvaldo@gmail.com", "12121");
        edvaldoAccount.DepositMoney(100);
        edvaldoAccount.WithDraw(200);
    }
}
