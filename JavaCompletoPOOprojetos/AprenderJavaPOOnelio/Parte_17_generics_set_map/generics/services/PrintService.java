package JavaCompletoPOOprojetos.AprenderJavaPOOnelio.Parte_17_generics_set_map.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {
        list.add(value);
    }

    public Integer first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.println("[");
        if (!list.isEmpty()) {
            System.out.println(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.println(", " + list.get(i));
        }
        System.out.println("]");
    }
}
