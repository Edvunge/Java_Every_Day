package sites.Chat_GPT.CollectionsFramework.AULA01_IntroducaoCollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nomes {
    // Crie um programa que use um ArrayList para armazenar 5 nomes, depois os imprima em ordem alfabética.
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Zecarias");
        nomes.add("Antonio");
        nomes.add("Carlos");
        nomes.add("Yhury");
        nomes.add("Zito");

        Collections.sort(nomes);

        for (String name : nomes) {
            System.out.println(name);
        }
    }
}
