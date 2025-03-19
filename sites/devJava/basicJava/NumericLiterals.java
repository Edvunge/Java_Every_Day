package sites.devJava.basicJava;

public class NumericLiterals {
    public static void main(String[] args) {
        // Invalid: cannot put underscores
        // adjacent to a decimal point
        //float pi1 = 3_.1415F;

        //float pi2 = 3_.1415F;

        //long socialSecurityNumber1 = 999_99_9999_L;
        //System.out.println(socialSecurityNumber1);

        int x1 = 5_2;
        System.out.println(x1);

        //int x2 = 52_;

        int x3 = 5_______2;
        System.out.println(x3);

        //int x4 = 0_x52;

        int x6 = 0x5_2;
        System.out.println(x6);

        //int x7 = 0x52_;
    }
}
