package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos;

public class TestaCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        cdc1.numero = 1111111;
        cdc1.dataDeValidade = "01/01/2013";

        CartaoDeCredito cdc2 = new CartaoDeCredito();
        cdc2.numero = 222222;
        cdc2.dataDeValidade = "01/01/2014";

        System.out.println("Dados do Primeiro Cartão");
        System.out.println("Número: " + cdc1.numero);
        System.out.println("Data de validade: " + cdc1.dataDeValidade);

        System.out.println("--------------------------------------------");

        System.out.println("Dados do Segundo Cartão");
        System.out.println("Número: " + cdc2.numero);
        System.out.println("Data de validade: " + cdc2.dataDeValidade);
    }
}
