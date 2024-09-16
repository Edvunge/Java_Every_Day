package LoianeJavaBasico.JavaBasicoCourse_1_.aulasPoo.aula45CastingHeranca;

public abstract class Animal {
    private String nome;
    private String n;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
