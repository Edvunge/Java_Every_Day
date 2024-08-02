package JavaNotesForProfessionals.cap10_PrimitiveDataTypes;

public class ConvertingPrimitive {
    public static void main(String[] args) {
        // Widening Conversion:
        int a = 1;
        double d = a; // valid conversion to double, no cast needed (widening)

        // Narrowing Conversion:
        double d1 = 18.96;
      //int b1 = d1;
        int b2 = (int) d1;
    }
}
