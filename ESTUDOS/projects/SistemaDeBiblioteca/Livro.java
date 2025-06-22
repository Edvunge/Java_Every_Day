package ESTUDOS.projects.SistemaDeBiblioteca;

import static java.lang.System.out;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;
    public boolean emprestado;

    public boolean emprestar(){
        out.println("Emprestar Livro");
        return true;
    }

    public boolean devolver(){
        out.println("Devolver Livro");
        return true;
    }

    public String exibirDetalhes(){
        String comp = "Autor: "+ this.autor + " Titulo: " + this.titulo + " Ano de Publicacao " + this.anoPublicacao + " Status do livro: " + this.emprestado;
        return comp;
    }

}
