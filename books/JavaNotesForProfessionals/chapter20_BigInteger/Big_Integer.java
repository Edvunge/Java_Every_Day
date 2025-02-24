package books.JavaNotesForProfessionals.chapter20_BigInteger;

import java.math.BigInteger;

public class Big_Integer {
    public static void main(String[] args) {
        long longValue = Long.MAX_VALUE;
        BigInteger valueFromLong = BigInteger.valueOf(longValue);
        System.out.println(valueFromLong);


        int intValue = Integer.MIN_VALUE;
        BigInteger valueFromInt = BigInteger.valueOf(intValue);
        System.out.println(valueFromInt);
    }
}
