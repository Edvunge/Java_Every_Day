package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.K_Enumeracao.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.K_Enumeracao.dominio.Cliente;
import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.K_Enumeracao.dominio.TipoCliente;
import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.K_Enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
