package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula45CastingHeranca;

public class Test4 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if (pessoa instanceof Pessoa) {
            System.out.println("Objeto do tipo Pessoa");
        }

        if (aluno instanceof Aluno) {
            System.out.println("Objeto do tipo Aluno");
        }

        if (professor instanceof Professor) {
            System.out.println("Objeto do tipo Professor");
        }
    }
}
