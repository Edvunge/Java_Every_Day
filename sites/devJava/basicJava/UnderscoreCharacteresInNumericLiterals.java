package sites.devJava.basicJava;

public class UnderscoreCharacteresInNumericLiterals {
    public static void main(String[] args) {
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_99999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;

        System.out.println("creditCardNumber: " + creditCardNumber);
        System.out.println("socialSecurityNumber: " + socialSecurityNumber);
        System.out.println("pi: " + pi);
        System.out.println("hexBytes: " + hexBytes);
    }
}
