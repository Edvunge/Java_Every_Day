package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.H_heranca.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.H_heranca.dominio.Endereco;
import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.H_heranca.dominio.Funcionario;
import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.H_heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(200000);

        funcionario.imprime();
    }
}
