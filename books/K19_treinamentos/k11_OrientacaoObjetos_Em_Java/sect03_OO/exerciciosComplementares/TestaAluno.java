package books.K19_treinamentos.k11_OrientacaoObjetos_Em_Java.sect03_OO.exerciciosComplementares;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "edvaldo";
        aluno1.registoGeral = 2332;
        aluno1.dataDeNascimentoDosAlunos = 1999;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "vunge";
        aluno2.registoGeral = 4554;
        aluno2.dataDeNascimentoDosAlunos = 2000;

        System.out.println("Dados Do Aluno 1");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Registo Geral: " + aluno1.registoGeral);
        System.out.println("Data De Nascimento Dos Alunos: " + aluno1.dataDeNascimentoDosAlunos);

        System.out.println("-------------------------------------------");

        System.out.println("Dados Do Aluno 2");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Registo Geral: " + aluno2.registoGeral);
        System.out.println("Data De Nascimento Dos Alunos: " + aluno2.dataDeNascimentoDosAlunos);
    }
}
