package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class DoublePrimitive2 {
    public static void main(String[] args) {
        double d1 = 0d;
        double d2 = -0d;
        System.out.println(d1 == d2);
        System.out.println(1d / d1);
        System.out.println(1d / d2);
        System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY);
    }
}
