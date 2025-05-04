package sites.Chat_GPT.CollectionsFramework.AULA01_IntroducaoCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCollections {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Beatriz");

        Collections.sort(nomes); // Ordena em ordem alfabetica

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
