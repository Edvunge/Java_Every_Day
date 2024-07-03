package AlgaworksBlack.ignicaoJava.part1_MergulhandoEmJava_e_OO.banco;

public class Principal {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.nomeTitular = "joao da silva";
        minhaConta.agencia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 15_000;

        System.out.println("Titular: " + minhaConta.nomeTitular );
        System.out.println("saldo: " + minhaConta.saldo);
    }
}
