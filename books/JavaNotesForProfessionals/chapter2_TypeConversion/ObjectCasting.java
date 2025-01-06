package books.JavaNotesForProfessionals.chapter2_TypeConversion;

public class ObjectCasting {
    public static void main(String[] args) {
        Float floatVar = new Float(42.0f);
        Number n = floatVar;
        Float floatVar2 = (Float) n;
        Double doubleVar = (Double) n;
    }
}
