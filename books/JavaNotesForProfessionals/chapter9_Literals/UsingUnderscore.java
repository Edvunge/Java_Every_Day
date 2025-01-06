package books.JavaNotesForProfessionals.chapter9_Literals;

public class UsingUnderscore {
    public static void main(String[] args) {
        int i1 = 123456;
        int i2 = 123_456;
        System.out.println(i1 == i2);

        short binary = 0b0_1_0_1;
        int octal = 07_7_7_7_7_7_7_7_0;
        long hexBytes = 0xFF_EC_DE_5E;

        System.out.println("binary " + binary);
        System.out.println("octal " + octal);
        System.out.println(hexBytes + " hexBytes");
    }
}
