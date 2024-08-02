package JavaNotesForProfessionals.cap51_ObjectsClass.objectNullCheck;

import java.util.Objects;

public class NullCheck {
    public static void main(String[] args) {
        Object nullableObject = methodReturnObject();
        if (Objects.isNull(nullableObject)) {
            return;
        }
    }

    private static Object methodReturnObject() {
        return null;
    }
}
