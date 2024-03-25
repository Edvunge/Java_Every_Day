package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.test;

import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.repositorio.Repositorio;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.servico.RepositorioArquivo;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.servico.RepositorioBancoDeDados;
import MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.N_polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
