package books.JavaNotesForProfessionals.chapter9_Literals;

public class DecimalIntegerLiterals {
    public static void main(String[] args) {
        int max = 2147483647; // OK
        int min = -2147483648; // OK
        //int tooBig = 2147483648; // ERROR

        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
        //System.out.println("tooBig: "+ tooBig);

        //long big = 2147483648; // ERROR
        long big2 = 2147483648L; // OK

        int i = 2147483647;
        long l = i + 1;
        System.out.println("l: "+l);

        long l2 = i + 1L;
        System.out.println("l2: "+ l2);
    }
}
