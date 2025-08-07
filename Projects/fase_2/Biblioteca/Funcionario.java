package Projects.fase_2.Biblioteca;

public class Funcionario extends Pessoa {
    private String cargo;
    private String setor;
    private double salario;

    public Funcionario(String nome, String cpf, String email, String cargo, String setor) {
        super(nome, cpf, email);
        this.cargo = cargo;
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getTipo() {
        return "Funcionário";
    }

    public void processarEmprestimo(Emprestimo emprestimo) {
        System.out.println(nome + " processou o emprestimo: " + emprestimo.getId());
    }
}
