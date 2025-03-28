package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.relacionamentos;

import books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos.CartaoDeCredito;
import books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.classes_E_objetos.Cliente;

public class Testa2ClienteECartao {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        CartaoDeCredito cdc = new CartaoDeCredito();

        c.nome = "Rafael Cosentino";
        c.codigo = 123;

        cdc.numero = 11111;
        cdc.dataDeValidade = "12/12/18";

        System.out.println("Dados do cliente");
        System.out.println("Nome: " + c.nome);
        System.out.println("Codigo: " + c.codigo);

        System.out.println("-----------------------------------");

        System.out.println("Dados do cartão");
        System.out.println("Numero: " + cdc.numero);
        System.out.println("Data de validade: " + cdc.dataDeValidade);

        System.out.println("-----------------------------------");

        cdc.cliente = c;

        System.out.println("Dados do cliente obtidos atraves do cartao");
        System.out.println(cdc.cliente.nome);
        System.out.println(cdc.cliente.codigo);
    }
}
