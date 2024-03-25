package JavaNotesForProfessionals.cap_20_BigInteger;

import java.math.BigInteger;

public class ComparingBigIntegers {
    public static void main(String[] args) {
        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);

        if (one.equals(two)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        BigInteger reallyBig = BigInteger.valueOf(10);
        BigInteger reallyBig2 = BigInteger.valueOf(100);

        if(reallyBig.compareTo(reallyBig) == 0) {
            // code when both are equal.
        } else if(reallyBig.compareTo(reallyBig2) == 1) {
            // code when reallyBig is greater than reallyBig1.
        } else if(reallyBig.compareTo(reallyBig2) == -1) {
            // code when reallyBig is less than reallyBig
        }
    }
}
