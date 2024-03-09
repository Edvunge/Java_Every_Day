package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_6_EstruturasDeDados_ArraysColecoes.Listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size()); // saber o tamanho da lista
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------------------");

        list.remove("Anna");// remover um elemento da lista
        list.remove(1); // removendo um elemento pela posicao
        list.removeIf(x -> x.charAt(0) == 'M'); // removendo um elemento começando por M
        System.out.println(list.size()); // saber o tamanho da lista

        for (String x : list) {
            System.out.println(x);
        }

    }
}
