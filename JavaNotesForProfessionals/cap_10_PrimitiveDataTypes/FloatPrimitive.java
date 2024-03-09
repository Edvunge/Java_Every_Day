package JavaNotesForProfessionals.cap_10_PrimitiveDataTypes;

public class FloatPrimitive {
    public static void main(String[] args) {
        double doubleExample = 0.5;        // without 'f' after digits = double
        float floatExample = 0.5f;         // with 'f' after digits    = float

        float myFloat = 92.7f;             // this is a float...
        float positiveFloat = 89.3f;       // it can be positive,
        float negativeFloat = -89.3f;      // or negative
        float integerFloat = 43.0f;        // it can be a whole number (not an int)
        float underZeroFloat = 0.0549f;    // it can be a fractional value less than 0

        // addition
        float result = 37.2f + -2.6f;      // result: 34.6

        // subtraction
        float result1 = 45.1f - 10.3f;      // result: 34.8

        // multiplication
        float result2 = 26.3f * 1.7f;      // result: 44.8

        // division
        float result3 = 37.1f / 4.8f;      // result: 7.729166

        // modulus
        float result4 = 37.1f % 4.8f;      // result: 3.4999971


        float notExact = 3.1415926f;
        System.out.println(notExact);      // 3.1415925


        float defaultFloat;

        float f1 = 0f;
        float f2 = -0f;
        System.out.println(f1 == f2); // true
        System.out.println(1f / f1); // Infinity
        System.out.println(1f / f2); // -Infinity
        System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY); // NaN
    }
}