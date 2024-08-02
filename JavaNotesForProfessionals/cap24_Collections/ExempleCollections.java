package JavaNotesForProfessionals.cap24_Collections;

import java.util.ArrayList;
import java.util.List;

public class ExempleCollections {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();

        // adicionar uma string na nossa lista
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        // removendo um elemento da lista
        fruits.remove("apple");


        // percorrendo a lista com forEACH
        for (String nome : fruits) {
            System.out.println(" " + nome);
        }

        System.out.println("\n + + + + + + + + + + + + \n");

        fruits.add("peneapple");
        fruits.add("avocate");
        fruits.add("tomato");
        fruits.add("orange");

        for (String nome : fruits) {
            System.out.println(" " + nome);
        }
    }
}
