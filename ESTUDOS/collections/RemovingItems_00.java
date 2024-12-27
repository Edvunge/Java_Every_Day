package ESTUDOS.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemovingItems_00 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        System.out.println("lista de frutas: " + fruits);

        //System.out.println("Depois de removido: "+fruits.get(0));

        //fruits.remove("Apple");
        //System.out.println("lista de frutas: " + fruits);

        // Uma outra forma de remover um item em uma lista
        // Removing in while loop using an Iterator
        /*Iterator<String> fruitIterator = fruits.iterator();
        while (fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);

            if ("Apple".equals(fruit)) {
                fruitIterator.remove();
            }
        }*/

        // Iterating backwards
        /*for (int i = (fruits.size() - 1); i >= 0; i--) {
            System.out.println(fruits.get(i));
            if ("Apple".equals(fruits.get(i))) {
                fruits.remove(i);
            }
        }*/


        System.out.println(" --- Removing --- ");
        System.out.println("lista de frutas: " + fruits);

    }
}
