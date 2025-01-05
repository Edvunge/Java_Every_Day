package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_19_Generics_set_map.set.application;

import JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_19_Generics_set_map.set.entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Programmn {
    public static void main(String[] args) {
        Set<Programmn> set = new HashSet<>();
        //set.add(new Main("TV", 900.0));
        //set.add(new Product("Notebook", 1200.0));
        //set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }
}
