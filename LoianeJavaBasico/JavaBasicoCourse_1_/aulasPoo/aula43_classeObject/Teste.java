package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula43_classeObject;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("ciencia da computacao");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);
    }
}
