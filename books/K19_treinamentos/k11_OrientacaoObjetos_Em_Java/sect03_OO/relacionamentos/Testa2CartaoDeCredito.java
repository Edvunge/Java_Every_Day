package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.relacionamentos;

import books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos.CartaoDeCredito;
import books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos.Cliente;

public class Testa2CartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cdc = new CartaoDeCredito();
        Cliente c = new Cliente();

        // Ligando os objetos
        cdc.cliente = c;

        // Acessando o nome do cliente
        cdc.cliente.nome = "Rafael Cosentino";

        System.out.println(cdc.cliente.nome);
    }
}
