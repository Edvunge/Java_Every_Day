package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula37_heranca.aula38_palavraChaveSuper;

public class Professor extends Pessoa {

    private double salario;
    private String nomeDoCurso;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }
}