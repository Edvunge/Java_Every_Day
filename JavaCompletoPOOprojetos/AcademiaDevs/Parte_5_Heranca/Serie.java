package JavaCompletoPOOprojetos.AcademiaDevs.Parte_5_Heranca;

public class Serie {
    private String nome;
    private int temporada;
    private int ano;

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", temporada=" + temporada +
                ", ano=" + ano +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Serie(String nome, int temporada, int ano) {
        this.nome = nome;
        this.temporada = temporada;
        this.ano = ano;
    }
}
