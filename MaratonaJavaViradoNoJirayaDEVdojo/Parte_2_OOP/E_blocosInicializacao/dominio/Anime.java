package MaratonaJavaViradoNoJirayaDEVdojo.Parte_2_OOP.E_blocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }
}
