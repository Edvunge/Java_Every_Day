package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.L_ClassesAbstratas.test;

import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.L_ClassesAbstratas.dominio.Desenvolvedor;
import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.L_ClassesAbstratas.dominio.Funcionario;
import MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.L_ClassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nemi", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("TouYa", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
