package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_4_Encapsulamento;

public class Cliente {
    private String nome;

    public String consultaNome(){
        return this.nome;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
       return  this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
