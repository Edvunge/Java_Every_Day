package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_4_Encapsulamento;

public class Funcionario {
    double salario;
    String nome;

    public double getSalario() {
        return this.salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}