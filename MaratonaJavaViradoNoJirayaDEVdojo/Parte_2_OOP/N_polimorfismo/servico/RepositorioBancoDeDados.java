package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.servico;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em banco de dados");
    }
}
