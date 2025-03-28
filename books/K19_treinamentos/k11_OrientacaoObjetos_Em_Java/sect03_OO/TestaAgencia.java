package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO;

public class TestaAgencia {
    public static void main(String[] args) {
        Agencia a1 = new Agencia();
        a1.numero = 1234;

        Agencia a2 = new Agencia();
        a2.numero = 5678;

        System.out.println("Dados da primeira agencia");
        System.out.println("Numero: " + a1.numero);

        System.out.println("-------------------------------");

        System.out.println("Dados da segunda agencia");
        System.out.println("Numero: " + a2.numero);
    }
}
