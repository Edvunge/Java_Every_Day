package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class DoublePrimitive {
    public static void main(String[] args) {

        double example  = -7162.37;
        double myDouble = 974.21;
        double anotherDouble = 658.7;

        double addedDoubles = myDouble + anotherDouble;
        double subtractedDoubles = myDouble - anotherDouble;

        double scientificNotationDouble = 1.2e-3;

        double notExact = 1.32 - 0.42;
        System.out.println("notExact: " + notExact);
    }
}
