package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class FloatPrimitive {
    public static void main(String[] args) {
        double doubleExample = 0.5;
        float floatExample = 0.5f;

        float myFloat = 92.7f;
        float positiveFloat = 89.3f;
        float negativeFloat = -89.3f;
        float integerFloat = 43.0f;
        float underZeroFloat = 0.0549f;

        System.out.println("without 'f' after digits = double: " + doubleExample);
        System.out.println("with 'f' after digits = float: " + floatExample);
        System.out.println("this is a float... " + myFloat);
        System.out.println("it can be positive, " + positiveFloat);
        System.out.println("or negative, " + negativeFloat);
        System.out.println("it can be a whole number (not an int) " + integerFloat);
        System.out.println("it can be a fractional valve less than 0 " + underZeroFloat);
    }
}
