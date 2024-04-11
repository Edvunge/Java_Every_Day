package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_3_hiper;

public class Filme extends Video {
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "portugues";
        this.legenda = "nenhuma";
    }

    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
        super.play();
    }

    public void play(String audio) {
        System.out.println("Play: " + toString());
        this.audio = audio;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    @Override
    public String toString() {
        String informacao = String.format("Filme %s (audio $s, legenda %s)", getNome(), audio, legenda);
        return informacao;
    }
}
