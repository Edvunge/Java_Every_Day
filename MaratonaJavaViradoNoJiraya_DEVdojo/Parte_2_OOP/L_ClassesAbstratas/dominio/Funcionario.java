package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.L_ClassesAbstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
