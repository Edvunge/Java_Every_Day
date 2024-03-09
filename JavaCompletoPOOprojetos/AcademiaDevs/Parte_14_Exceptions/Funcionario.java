package JavaCompletoPOOprojetos.AcademiaDevs.Parte_14_Exceptions;

public class Funcionario {
    private double salario;

    public void aumentaSalario(double aumento) {
        if (aumento < 0) {
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }
    }

    // Getters And Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
