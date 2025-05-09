package ESTUDOS.collections.projects.Proj1_catalogoDeLivros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    // Título (String)
    // Autor (String)
    // Ano de publicação (int)
    public String titulo;
    public String autor;
    public int ano_de_publicacao;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> livros = new ArrayList<String>();
        livros.add("aaaaaa");
        livros.add("bbbbbb");
        livros.add("cccccc");
        livros.add("dddddd");
        livros.add("eeeeee");
        /*ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);*/

        ArrayList<String> input_books = new ArrayList<String>();
        /*
        O programa deve:

        1. Adicionar livros ao catálogo.
        2. Listar todos os livros ordenados por título.
        3. Listar todos os livros agrupados por autor.
        4. Buscar livros por uma parte do título.
        5. Remover um livro pelo título.

        */

        // Adicionar livros
        /*
        System.out.println("Digite o nome do livro: ");
        String inR = input.next();

        livros.add(inR);
        System.out.println(livros);
        */

        // Listar livros
        livros.sort((a, b) -> { return 1 * a.compareTo(b); } );
        System.out.println(livros);
    }
}
