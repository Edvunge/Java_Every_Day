package Java_COMPLETO_POO_Projetos.Apostila_java_POO;

public class Conta2 extends Conta {
    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);

        if (retirou == false) {
            // nao deu pra sacar!
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }
    }
}
