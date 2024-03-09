package JavaNotesForProfessionals.cap_9_Literals;

public class ImproveReadability {
    public static void main(String[] args) {
        int i1 = 12345;
        int i2 = 123_456;
        System.out.println(i1 == i2); // true


        byte color = 1_2_3;
        short yearsAnnoDomini = 2_016;
        int socialSecurityNumber = 999_99_9999;
        long creditCardNumber = 1234_5678_9012_3456L;
        float piFourDecimals = 3.14_15F;
        double piTenDecimals = 3.14_15_92_65_35;


        short binary = 0b0_1_0_1;
        int octal = 07_7_7_7_7_7_7_0;
        long hexBytes = 0xFF_EC_DE_5E;
    }
}
