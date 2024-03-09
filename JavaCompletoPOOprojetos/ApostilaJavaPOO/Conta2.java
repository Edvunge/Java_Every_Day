package JavaCompletoPOOprojetos.ApostilaJavaPOO;

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
