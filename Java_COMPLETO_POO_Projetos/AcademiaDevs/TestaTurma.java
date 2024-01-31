package Java_COMPLETO_POO_Projetos.AcademiaDevs;

public class TestaTurma {
    public static void main(String[] args) {
        Turma turmaT = new Turma();
        turmaT.serie = "T";
        turmaT.periodo = "pos-laboral";
        turmaT.sigla = "LEI";
        turmaT.tipoDeEnsino = "EAD";

        Turma turmaP = new Turma();
        turmaP.serie = "P";
        turmaP.periodo = "pos-laboral";
        turmaP.sigla = "MEIC";
        turmaP.tipoDeEnsino = "Presencial";

        System.out.format("turma: T , serie: %s , period: %s sigla: %s tipo de ensino %s\n",turmaT.serie ,turmaT.periodo, turmaT.sigla, turmaT.tipoDeEnsino);
        System.out.format("turma: P , serie: %s , period: %s sigla: %s tipo de ensino %s\n",turmaP.serie ,turmaP.periodo, turmaP.sigla, turmaP.tipoDeEnsino);
    }
}
