package AlgaworksBlack.ignicaoJava.part1_MergulhandoEmJava_e_OO.banco;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "joao da silva";
        titular1.documento = "12333212";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Analucia da silva";
        titular2.documento = "12333212";

        Conta minhaConta = new Conta(titular1, 123, 998 );
        minhaConta.titular = titular1;
        minhaConta.agencia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 0;

        minhaConta.depositar(123_000);
        minhaConta.sacar(1_000);

        Conta suaConta = new Conta(titular2, 778, 887);
        suaConta.titular = titular2;
        suaConta.agencia = 223;
        suaConta.numero = 989;
        suaConta.saldo = 0;

        suaConta.depositar(23_000);

        System.out.println("Titular: " + minhaConta.titular);
        System.out.println("saldo: " + minhaConta.saldo);

        System.out.println("Titular: " + suaConta.titular);
        System.out.println("saldo: " + suaConta.saldo);
    }
}
