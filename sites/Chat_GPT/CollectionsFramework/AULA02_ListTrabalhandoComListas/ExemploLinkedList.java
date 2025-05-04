package sites.Chat_GPT.CollectionsFramework.AULA02_ListTrabalhandoComListas;

import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tarefas = new LinkedList<>();

        tarefas.add("Lavar Roupa");
        tarefas.add("Estudar Java");
        tarefas.add("Fazer Compras");

        tarefas.addFirst("Acordar");
        tarefas.addLast("Dormir");

        System.out.println("Tarefas do Dia: ");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

        System.out.println("\nPrimeira tarefa: " + tarefas.getFirst());
        System.out.println("Ultima tarefa: " + tarefas.getLast());
    }
}
