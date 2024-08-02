package JavaNotesForProfessionals.cap24_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cap_24_Collections {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        Iterator<String> fruitIterator = fruits.iterator();
        while(fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
            if ("Apple".equals(fruit)) {
                fruitIterator.remove();
            }

            // Filtering a Stream
            // List<String> filteredList = fruits.stream().filter(p -> !"Apple".equals(p)).collect(Collectors.toList());
        }
    }
}
