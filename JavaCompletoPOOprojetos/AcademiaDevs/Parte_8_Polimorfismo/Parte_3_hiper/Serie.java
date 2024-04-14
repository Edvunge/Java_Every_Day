package JavaCompletoPOOprojetos.AcademiaDevs.Parte_8_Polimorfismo.Parte_3_hiper;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void play(int temporadas, int episodio) {
        if (validarEpisodio(temporadas, episodio)) {
            this.temporadaAtual = temporadas;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episodio invalido!");
        }
    }

    private boolean validarEpisodio(int temporadas, int episodio) {
        if (temporadas == 0 || episodio == 0)
            return false;

        if (temporadas > temporadas || episodio > episodiosPorTemporada)
            return false;

        return true;
    }
}
