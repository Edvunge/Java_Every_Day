package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula41_classesAbstract;

public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;


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

    public void metodoQualquer() {
        super.setCpf("34353435363434");

        this.setCpf("34353434");
    }

    public String obterEtiquetaEndereco(){

        String s = "Endereco do Aluno: ";
        s += super.getEndereco();

        return s;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println(this.obterEtiquetaEndereco());
    }
}
