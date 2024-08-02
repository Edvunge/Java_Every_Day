package JavaNotesForProfessionals.cap51_ObjectsClass.objectNullCheck;

import java.util.Objects;

public class NotNullCheck {
    public static void main(String[] args) {
        Object nullableObject = methodReturnObject();
        if (Objects.nonNull(nullableObject)) {
            return;
        }
    }

    private static Object methodReturnObject() {
        return null;
    }
}
