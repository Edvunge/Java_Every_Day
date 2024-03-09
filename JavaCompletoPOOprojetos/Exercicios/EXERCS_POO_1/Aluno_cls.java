package JavaCompletoPOOprojetos.Exercicios;

public class Aluno_cls {
    /*
    8. Crie uma classe `Aluno` com atributos nome, matrícula e nota.
    Adicione um método para verificar se o aluno foi aprovado (nota maior ou igual a 6).
    */
    public String nome;
    public String matricula;
    public double nota;

    void verificarClassificacaoDoAluno(double nota) {
        String matricula = "323jk3jj3";
        String nome = "eduard Dubois";

        if (nota >= 6){
            System.out.format("O o seu nome: %s\n",nome);
            System.out.format("A sua nota eh %.2f , voce esta aprovado\n",nota);
            System.out.format("O estudante %s\n",matricula);
        } else {
            System.out.format("O o seu nome: %s\n",nome);
            System.out.format("A sua nota eh %.2f , voce esta Reprovado\n",nota);
            System.out.format("O estudante %s\n",matricula);
        }
    }

    public static void main(String[] args) {
        Aluno_cls aluno = new Aluno_cls();

        aluno.verificarClassificacaoDoAluno(2.0);
    }
}