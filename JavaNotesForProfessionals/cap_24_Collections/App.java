package JavaNotesForProfessionals.cap_24_Collections;

import java.util.List;

public class App {
    public static void main(String[] args) {
        MyPojoClass pojo = new MyPojoClass();
        pojo.addValueToIntList(42);

        List<Integer> list = pojo.getIntList();
        list.add(69);
    }
}
