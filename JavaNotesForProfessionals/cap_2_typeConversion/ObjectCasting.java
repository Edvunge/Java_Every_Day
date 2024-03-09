package JavaNotesForProfessionals.cap_2_typeConversion;

public class ObjectCasting {
    public static void main(String[] args) {
        Float floatVar = new Float(42.0f);
        Number n = floatVar;                // implicit (float implements Number)
        Float floatVar2 = (Float) n;       // explicit
        Double doubleVar = (Double) n;     // Throws exception (the object is not Double)
    }
}
