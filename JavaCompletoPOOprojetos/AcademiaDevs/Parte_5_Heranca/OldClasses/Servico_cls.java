package JavaCompletoPOOprojetos.AcademiaDevs.Parte_5_Heranca.OldClasses;

import JavaCompletoPOOprojetos.AcademiaDevs.Parte_1.Cliente;
import JavaCompletoPOOprojetos.AcademiaDevs.Parte_1.Funcionario;

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
