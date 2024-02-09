package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_5_Heranca;

import Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1.Cliente;
import Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1.Funcionario;

public class Servico_cls {
    // geral
    private Cliente contratante;
    private Funcionario responsavel;
    private String dataDeContratacao;

    // metodos
    public double calculaTaxa() {
        return 10;
    }
}
