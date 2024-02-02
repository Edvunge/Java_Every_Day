package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_1;

public class Gerente {
    String nome;
    double salario;

    void aumentaSalario() {
        this.aumentaSalario(0.1);
    }

    void aumentaSalario(double taxa) {
        this.salario += this.salario * taxa;
    }
}
