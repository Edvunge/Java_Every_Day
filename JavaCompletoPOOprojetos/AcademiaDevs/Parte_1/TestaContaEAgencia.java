package JavaCompletoPOOprojetos.AcademiaDevs.Parte_1;

public class TestaContaEAgencia {
    public void main(String[] args) {
        Agencia a = new Agencia(1234);
        Conta c = new Conta(a);

        a.numero = 178;

        c.numero = 123;
        c.saldo = 1.0;
        c.limite = 500;

        System.out.println("Dados da agencia");
        System.out.println("Numero: " + a.numero);

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Dados da conta");
        System.out.println("Numero: " + c.numero);
        System.out.println("Saldo: " + c.saldo);
        System.out.println("Limite: " + c.limite);

        System.out.println("---------------------------------------------------------------------------");

        c.agencia = a;

        System.out.println("Dados da agencia obtidos atraves da conta");
        System.out.println(c.agencia.numero);

        // chamando o methodo deposita
        c.deposita(1000);
        System.out.println("novo Saldo: " + c.saldo);

       // double saldoDisponivel = c.consultaSaldoDisponivel();
        //System.out.println("Saldo Disponivel: " + this.saldoDisponivel);
    }
}
