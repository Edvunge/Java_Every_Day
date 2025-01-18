package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class ConvertingPrimitives {
    public static void main(String[] args) {

        // Widenning Conversion:
        int a = 1;
        double d = a;
        System.out.println("d: " + d);

        // Narrowing Conversion:
        double d1 = 18.96;
        //int b = d1;
        int b1 = (int)d1;
        System.out.println("d1: " + d1);

    }
}
