package books.JavaBasico_ConceitosIniciaisDeProgramacao.modulo10.project02;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        /*
        2. Lista de Tarefas

        Descrição: Um aplicativo que permite adicionar, remover e visualizar tarefas.

        Aprendizado: Manipulação de listas (ArrayList), manipulação de strings e estrutura de dados.

        Desafios: Implementar persistência de dados usando arquivos para salvar a lista de tarefas.
        */
        Scanner input = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>();
        taskList.add("Washing the dishes");
        taskList.add("Cleaning the floor");
        taskList.add("Tidying the house");
        taskList.add("Ironing");
        taskList.add("Cooking");
        taskList.add("Taking out the garbage");
        taskList.add("Dusting");

        System.out.println("| Menu Lista de tarefas |");
        System.out.println("| Escolha uma opcção: |");
        System.out.println("| Opcção 1 - Adicionar um elemento a lista |");
        System.out.println("| Opcção 2 - Visualizar os elementos da lista |");
        System.out.println("| Opcção 3 - Remover um elemento da lista |");
        int option = input.nextInt();

        switch (option) {
            case 1:// add element
                System.out.println("Digite uma tarefa que deseja adicionar a lista: ");
                String element1 = input.next();
                taskList.add(element1);

                System.out.println("Digite uma outra tarefa que deseja adicionar a lista: ");
                String element2 = input.next();
                taskList.add(element2);

                System.out.println("Digite uma terceira tarefa que deseja adicionar a lista: ");
                String element3 = input.next();
                taskList.add(element3);
                break;
            case 2:// visualize element
                System.out.print("\n\t\t=== Task List Element ===\n\n");

                for (String list : taskList) {
                    System.out.println(list);
                }
                break;
            case 3:// removing element
                // Removendo um elemento pelo indice
//              lista.remove(1); // remove "Python"
//              System.out.println("Lista apos remoção: " + lista);

                System.out.println("Qual elemento deseja remover na lista: ");
                int numberOfElement = input.nextInt();
                taskList.remove(numberOfElement);

                System.out.println("Lista apos remoção: " + taskList);
                break;
            default:// default option
                System.out.println(" Default Option ");
        }

        // Adicionando elementos a uma lista
        //lista.add("Java");
        //lista.add("Python");
        //lista.add("C++");

        // imprimindo a lista
        //System.out.println("Lista das linguagens: " + lista);

        // Acessando um elemento pelo indice
//        System.out.println("Primeira linguagem: " + lista.get(0));

        // Removendo um elemento pelo indice
//        lista.remove(1); // remove "Python"
//        System.out.println("Lista apos remoção: " + lista);

        // Verificando o tamanho da lista
//        System.out.println("Tamanho da lista: " + lista.size());

        // Verificando se a lista contem um elemento
//        System.out.println("Contem 'C++'? " + lista.contains("C++"));

        // iterando pela lista
//        for (String linguagem : lista) {
//            System.out.println(linguagem);
//        }

    }
}
