package books.JavaNotesForProfessionals.chapter2_TypeConversion;

public class ImplicitCasting {
    public static void main(String[] args) {
        // Implicit Casting
        byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;

        System.out.println("doubleVar: " + doubleVar);
        System.out.println("floatVar " + floatVar);
        System.out.println("longVar: " + longVar);
        System.out.println("intVar: " + intVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("byteVar: " + byteVar);
    }
}
