package sites.Chat_GPT.CollectionsFramework.AULA02_ListTrabalhandoComListas;

import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        Vector<String> nomes = new Vector<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Carlos");

        nomes.insertElementAt("Ana", 1);

        System.out.println("Todos os nomes: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove("Maria");
        System.out.println("Apos remoção: " + nomes);
    }
}
