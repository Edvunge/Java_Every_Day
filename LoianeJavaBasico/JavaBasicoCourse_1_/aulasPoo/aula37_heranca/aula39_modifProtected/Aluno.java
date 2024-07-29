package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula37_heranca.aula39_modifProtected;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;

    public void verificarAcesso() {

        this.nomeVisibilidade = "sesdfsdf";
        super.nomeVisibilidade = "sefdfsdf";
    }

    public Aluno() {
        super();
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificadorAprovado() {
        return true;
    }
}
