package sites.Chat_GPT.CollectionsFramework.AULA02_ListTrabalhandoComListas;

import java.util.ArrayList;
import java.util.List;

public class ListaExemplo {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Abacaxi");
        frutas.add("Banana");

        System.out.println("Fruta na posição 1: " + frutas.get(1));
        System.out.println("Lista completa: " + frutas);

        frutas.remove("Maçã");
        frutas.set(0, "Melancia");

        System.out.println("Lista apos as alterações: " + frutas);
    }
}
