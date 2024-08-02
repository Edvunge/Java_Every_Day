package JavaNotesForProfessionals.cap51_ObjectsClass.nonNull;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> someObjects = methodGetList();
        for (Object obj : someObjects) {
            if (obj == null) {
                continue;
            }
            doSomething(obj);
        }
    }

    private static void doSomething(Object obj) {

    }

    private static List<Object> methodGetList() {
        return null;
    }
}
