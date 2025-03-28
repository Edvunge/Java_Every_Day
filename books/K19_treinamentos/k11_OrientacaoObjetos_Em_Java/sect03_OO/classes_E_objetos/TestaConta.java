package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos;

public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1234;
        c1.saldo = 1000;
        c1.limite = 500;

        Conta c2 = new Conta();
        c2.numero = 5678;
        c2.saldo = 2000;
        c2.limite = 250;

        System.out.print("\nDados da primeira conta");
        System.out.println("Numero:: "  + c1.numero);
        System.out.println("Saldo: " + c1.saldo);
        System.out.println("Limite: " + c1.limite);

        System.out.println("----------------------------------");

        System.out.print("\nDados da segunda conta");
        System.out.println("Numero:: "  + c2.numero);
        System.out.println("Saldo: " + c2.saldo);
        System.out.println("Limite: " + c2.limite);
    }
}
