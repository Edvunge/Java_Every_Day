package Projects.fase_2.CountNumbersHavingUniqueDigits;

public class UniqueDigitCounter {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0) {
            return 1;
        }
        if(n > 10) {
            n = 10; // only 10 digits exist (0-9)
        }

        int total = 10; // for n = 1
        int uniqueDigits = 9; // first digit (1-9)
        int availableDigits = 9;

        for (int i = 2; i <= n; i++) {
            uniqueDigits *= availableDigits;
            total += uniqueDigits;
            availableDigits--;
        }

        return total;
    }

    public static void main(String[] args) {
        UniqueDigitCounter counter = new UniqueDigitCounter();

        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        int n4 = 3;

        System.out.println("Count for n = " + n1 + ": " + counter.countNumbersWithUniqueDigits(n1));
        System.out.println("Count for n = " + n2 + ": " + counter.countNumbersWithUniqueDigits(n2));
        System.out.println("Count for n = " + n3 + ": " + counter.countNumbersWithUniqueDigits(n3));
        System.out.println("Count for n = " + n4 + ": " + counter.countNumbersWithUniqueDigits(n4));
    }
}
