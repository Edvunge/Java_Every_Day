package books.JavaNotesForProfessionals.chapter20_BigInteger;

import java.math.BigInteger;

public class Comparing_BigInteger {
    public static void main(String[] args) {
        BigInteger one = BigInteger.valueOf(1);
        BigInteger two = BigInteger.valueOf(2);

        if(one.equals(two)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
