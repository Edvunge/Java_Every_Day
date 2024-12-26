package books.JavaBasico_ConceitosIniciaisDeProgramacao.modulo10.project02;

import java.util.ArrayList;

public class ListaTelefonica {
    public static void main(String[] args) {
        /*
        2. Lista de T arefas

        Descrição: Um aplicativo que permite adicionar, remover e visualizar tarefas.

        Aprendizado: Manipulação de listas (ArrayList), manipulação de strings e estrutura de dados.

        Desafios: Implementar persistência de dados usando arquivos para salvar a lista de tarefas.
        */
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos a uma lista
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // imprimindo a lista
        System.out.println("Lista das linguagens: " + lista);

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
