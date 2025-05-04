package sites.Chat_GPT.CollectionsFramework.AULA02_ListTrabalhandoComListas;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        while (!fila.isEmpty()) {
            System.out.println("Atendendo: " +fila.poll());
        }
    }
}
