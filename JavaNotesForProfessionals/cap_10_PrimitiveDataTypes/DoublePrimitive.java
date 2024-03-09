package JavaNotesForProfessionals.cap_10_PrimitiveDataTypes;

public class DoublePrimitive {
    public static void main(String[] args) {
        double example = -7162.37;
        double myDouble = 974.21;
        double anotherDouble = 658.7;

        double addedDoubles = myDouble + anotherDouble;      // 315.51
        double subtractedDoubles = myDouble - addedDoubles;  // 1632.91
        double scientificNotationDouble = 1.2e-3;            // 0.0012

        double notExact = 1.32 - 0.42;
        System.out.println(notExact);

        double d1 = 0d;
        double d2 = -0d;
        System.out.println(d1 == d2); // true
        System.out.println(1d / d1); // Infinity
        System.out.println(1d / d2); // -Infinity
        System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY); // NaN
    }
}
