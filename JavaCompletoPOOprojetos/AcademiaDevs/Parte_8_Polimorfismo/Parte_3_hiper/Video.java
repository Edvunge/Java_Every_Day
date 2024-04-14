package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_3_hiper;

public class Video {
    private String nome;

    public void play() {
        System.out.println("Play: video qualquer");
    }

    public String getNome() {
        return nome;
    }

    public Video(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
