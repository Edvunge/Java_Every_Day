package books.JavaNotesForProfessionals.chapter2_TypeConversion;

public class ExplicitCasting {
    public static void main(String[] args) {
        double doubleVar = 42.0d;
        float floatVar = (float) doubleVar;
        long longVar = (long) floatVar;
        int intVar = (int) longVar;
        short shortVar = (short) intVar;
        byte byteVar = (byte) shortVar;

        System.out.println("doubleVar: " + doubleVar);
        System.out.println("floatVar " + floatVar);
        System.out.println("longVar: " + longVar);
        System.out.println("intVar: " + intVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("byteVar: " + byteVar);
    }
}
