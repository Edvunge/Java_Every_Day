package JavaCompletoPOOprojetos.ApostilaJavaPOO.book.ApostilaJAVA.cap_4_basicoPOO;

public class TestaAlgunsMetodos {
    public static void main(String[] args) {
        // criando a conta
        Conta minhaConta = new Conta();

        // alterando os valores de minha conta
        minhaConta.titular = "Duke";
        minhaConta.saldo = 1000;

        // saca 200 reais
        minhaConta.saca(200);

        // deposita 500 reais
        minhaConta.deposita(500);
        System.out.println(minhaConta.saldo);
    }
}
