package JavaCompletoPOOprojetos.AcademiaDevs.Parte_1;

public class TesteAlunoTurma {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "edvaldo";
        aluno.rg = 23421;
        aluno.dataDeNascimntDosAluns = "18/06/1995";

        // Inicializando a turma
        aluno.turma = new Turma();
        aluno.turma.periodo = "noturno";
        aluno.turma.serie = "AS";
        aluno.turma.sigla = "MAI";
        aluno.turma.tipoDeEnsino = "Presencial";


        System.out.format("Aluno: %s\n",aluno.nome);
        System.out.format("RG: %s\n",aluno.rg);
        System.out.format("Data de nascimento: %s\n",aluno.dataDeNascimntDosAluns);
        System.out.format("Periodo: %s\n",aluno.turma);
        System.out.format("Serie: %s\n",aluno.turma.serie);
        System.out.format("Sigla: %s\n",aluno.turma.sigla);
        System.out.format("Tipo de ensino: %s\n",aluno.turma.tipoDeEnsino);
    }
}
