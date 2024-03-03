package Java_COMPLETO_POO_Projetos.AcademiaDevs.Parte_5_Heranca.Animais;

public class Animal {
    private String nome;

    public void comer() {
        System.out.printf("%s comeu\n", nome);
    }

    public void beber() {
        System.out.printf("%s bebeu\n", nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
