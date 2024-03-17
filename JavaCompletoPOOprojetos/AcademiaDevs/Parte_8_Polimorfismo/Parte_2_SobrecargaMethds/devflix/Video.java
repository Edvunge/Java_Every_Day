package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_2_SobrecargaMethds.devflix;

public class Video {
    private String nome;

    public Video(String nome) {
        this.nome = nome;
    }

    public void play() {
        System.out.println("Play: Video Qualquer");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
