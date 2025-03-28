package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos;

public class TestaValoresPadrao {
    public static void main(String[] args) {
        Conta c = new Conta();

        System.out.println("Valores Padrao");
        System.out.println("Numero: " + c.numero);
        System.out.println("Saldo: " + c.saldo);
        System.out.println("Limite: " + c.limite);
    }
}
