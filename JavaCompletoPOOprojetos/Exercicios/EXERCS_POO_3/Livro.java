package JavaCompletoPOOprojetos.Exercicios.EXERCS_POO_3;

public class Livro {
    // titulo, autor, numeroDePaginas, genero,
    public String titulo;
    public String autor;
    public int numeroDePaginas;
    public String genero;
    public String Editora;
    public double milimetroPorFolha;


    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", genero='" + genero + '\'' +
                ", Editora='" + Editora + '\'' +
                ", milimetroPorFolha=" + milimetroPorFolha +
                '}';
    }

    public double getMilimetroPorFolha() {
        return milimetroPorFolha;
    }

    public void setMilimetroPorFolha(double milimetroPorFolha) {
        this.milimetroPorFolha = milimetroPorFolha;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
