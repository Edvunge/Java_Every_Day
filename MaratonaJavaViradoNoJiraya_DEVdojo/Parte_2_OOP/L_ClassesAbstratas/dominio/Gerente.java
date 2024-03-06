package MaratonaJavaViradoNoJiraya_DEVdojo.Parte_2_OOP.L_ClassesAbstratas.dominio;

public class Gerente extends  Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
