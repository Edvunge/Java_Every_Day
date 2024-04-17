package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_4_basicoPOO;

public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo Atual: " + minhaConta.saldo);

        minhaConta.saca(45.5);
        System.out.println("Saldo Atual: " + minhaConta.saldo);
    }
}
