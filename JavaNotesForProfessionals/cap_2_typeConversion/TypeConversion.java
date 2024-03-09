package JavaNotesForProfessionals.cap_2_typeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit casting
        /*byte byteVar = 42;
        short shortVar = byteVar;
        int intVar = shortVar;
        long longVar = intVar;
        float floatVar = longVar;
        double doubleVar = floatVar;*/

        // Explicit Casting
        double doubleVar = 42.0d;
        float floatVar = (float) doubleVar;
        long longVar = (long) floatVar;
        int intVar = (int) longVar;
        short shortVar = (short) intVar;
        byte byteVar = (byte) shortVar;

        // When casting floating point primitives (float, double) to whole number primitives,
        // the number is rounded down.


        System.out.println(doubleVar);
        System.out.println(floatVar);
        System.out.println(longVar);
        System.out.println(intVar);
        System.out.println(shortVar);
        System.out.println(byteVar);
    }
}
