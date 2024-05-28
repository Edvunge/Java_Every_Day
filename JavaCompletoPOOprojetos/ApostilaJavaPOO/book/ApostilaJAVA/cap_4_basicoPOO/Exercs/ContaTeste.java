package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_4_basicoPOO.Exercs;

public class ContaTeste {
    public static void main(String[] args) {
        Conta contaCorrete = new Conta();
        contaCorrete.saldo = 2.34;
        contaCorrete.numeroDaConta = 9088;
        contaCorrete.agencia = "BCCT";
        contaCorrete.nomeDoTitular = "Edvaldo";

        contaCorrete.sacar(12.9);
        contaCorrete.depositar(123.4);
        System.out.printf("O valor disponivel na conta: %.2f\n" , contaCorrete.calculaRendimento());
    }
}
