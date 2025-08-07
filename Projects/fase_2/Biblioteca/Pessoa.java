package Projects.fase_2.Biblioteca;

import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String email;
    protected Date dataCadastro;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataCadastro = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return String.format("%s: %s (CPF: %s, Email: %s)",
                getTipo(), nome, cpf, email);
    }
}
