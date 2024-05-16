package JavaNotesForProfessionals.cap_24_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleCollectionsAditionAndRemovingElemnts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        System.out.println("Digite 8 nomes para ser inserido a lista: ");
        String add1 = input.next();
        String add2 = input.next();
        String add3 = input.next();
        String add4 = input.next();
        String add5 = input.next();
        String add6 = input.next();
        String add7 = input.next();
        String add8 = input.next();

        // Adicionando elements
        nomes.add(add1);
        nomes.add(add2);
        nomes.add(add3);
        nomes.add(add4);
        nomes.add(add5);
        nomes.add(add6);
        nomes.add(add7);
        nomes.add(add8);

        // Removendo elemnts
        nomes.remove(add3);
        nomes.remove(add5);

        // Listar
        for (String nome : nomes) {
            System.out.println(" " + nome);
        }

        System.out.println("\n + + + + + + + + + \n");

        // outra forma de listar os elementos da lista
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("o tamanho da lista: " + nomes.size());
    }
}
