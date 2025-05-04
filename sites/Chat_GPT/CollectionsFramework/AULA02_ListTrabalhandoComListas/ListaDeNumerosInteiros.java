package sites.Chat_GPT.CollectionsFramework.AULA02_ListTrabalhandoComListas;

import java.util.LinkedList;

public class ListaDeNumerosInteiros {
    public static void main(String[] args) {
        /*
        Crie uma LinkedList de números inteiros. Adicione os números de 1 a 5, depois:

        Insira o número 10 na posição 2.

        Remova o número 3.

        Imprima todos os números usando for-each.
        */
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.set(2, 10);

        numeros.remove(3);

        for (int num : numeros) {
            System.out.printf(" " + num);
        }
    }
}
