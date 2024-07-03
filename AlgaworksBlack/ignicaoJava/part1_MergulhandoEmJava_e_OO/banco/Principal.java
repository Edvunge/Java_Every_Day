package AlgaworksBlack.ignicaoJava.part1_MergulhandoEmJava_e_OO.banco;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("joao da silva");
        titular1.setDocumento("12333212");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Analucia da silva");
        titular2.setDocumento("12333212");

        Conta minhaConta = new Conta(titular1, 123, 998 );
        minhaConta.setTitular(titular1);
        minhaConta.setAgencia(123);
        minhaConta.setNumero(987);
        minhaConta.setSaldo(0);

        minhaConta.depositar(123_000);
        minhaConta.sacar(1_000);

        Conta suaConta = new Conta(titular2, 778, 887);
        suaConta.setTitular(titular1);
        suaConta.setAgencia(323);
        suaConta.setNumero(987);
        suaConta.setSaldo(0);

        suaConta.depositar(23_000);

        System.out.println("Titular: " + minhaConta.titular);
        System.out.println("saldo: " + minhaConta.saldo);

        System.out.println("Titular: " + suaConta.titular);
        System.out.println("saldo: " + suaConta.saldo);
    }
}
