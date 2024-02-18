package ESTUDOS;

import java.util.*;
public class Est_ArrayList {
    public static void main(String[] args) {
        // Passo 2: Criar um ArrayList
        ArrayList<String> minhaLista = new ArrayList<>();

        // Passo 3: Adicionar elementos
        minhaLista.add("Elemento 1");
        minhaLista.add("Elemento 2");
        minhaLista.add("Elemento 3");

        // Passo 4: Acessar elementos
        String primeiroElemento = minhaLista.get(0);
        System.out.println("Primeiro Elemento: " + primeiroElemento);

        // Passo 5: Remover elementos
        minhaLista.remove("Elemento 2");
        // minhaLista

        // Passo 6: Verificar se um elemento existe
        boolean elementoExiste = minhaLista.contains("Elemento 3");
        System.out.println("O Elemento 3 está na lista? " + elementoExiste);

        // Passo 7: Listar todos os elementos
        System.out.println("Lista de Elementos:");
        for (String elemento : minhaLista) {
            System.out.println(elemento);
        }
    }
}
