package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class FloatPrimitiveOP {
    public static void main(String[] args) {
        // addition
        float result = 37.2f + -2.6f;
        System.out.println("result1: " + 34.6);

        // subtraction
        float result2 = 45.1f - 10.3f;
        System.out.println("result2: " + 34.8);

        // multiplication
        float result3 = 26.3f * 1.7f;
        System.out.println("result3: " + result3);

        // division
        float result4 = 37.1f / 4.8f;
        System.out.println("result4: " + result4);

        // modulus
        float result5 = 37.1f % 4.8f;
        System.out.println("result5: " + result5);

        float notExact = 3.1415926f;
        System.out.println("notExact: " + notExact);

        float f1 = 0f;
        float f2 = -0f;
        System.out.println(f1 == f2); // true
        System.out.println(1f / f1);  // Infinity
        System.out.println(1f / f2);  // -Infinity
        System.out.println(Float.POSITIVE_INFINITY / Float.POSITIVE_INFINITY);
    }
}
