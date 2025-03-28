package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.exerciciosComplementares;

public class TestaTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.periodo = "tarde";
        turma1.serie = 9;
        turma1.sigla = "CFB9";
        turma1.tipoDeEnsino = "ensino a distancia";

        Turma turma2 = new Turma();
        turma2.periodo = "noite";
        turma2.serie = 8;
        turma2.sigla = "CFB8";
        turma2.tipoDeEnsino = "ensino presencial";

        System.out.println("Dados Da Turma 1");
        System.out.println("Periodo: " + turma1.periodo);
        System.out.println("Serie: " + turma1.serie);
        System.out.println("Sigla: " + turma1.sigla);
        System.out.println("Tipo de ensino: " + turma1.tipoDeEnsino);

        System.out.println("-----------------------------");

        System.out.println("Dados Da Turma 2");
        System.out.println("Periodo: " + turma2.periodo);
        System.out.println("Serie: " + turma2.serie);
        System.out.println("Sigla: " + turma2.sigla);
        System.out.println("Tipo de ensino: " + turma2.tipoDeEnsino);
    }
}
