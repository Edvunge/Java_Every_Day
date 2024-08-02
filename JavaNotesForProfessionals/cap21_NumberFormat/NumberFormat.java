package JavaNotesForProfessionals.cap21_NumberFormat;

public class NumberFormat {
    public static void main(String[] args) {
        // Locale locale = new Locale("en", "IN");
        // NumberFormat numberFormat = NumberFormat.getInstance(locale);

        // 1 format Number
        // numberFormat.format(10000000.9);

        // 2 Format Currency
        /*
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        currencyFormat.format(10340.999):
         */

        // 3. Format Percentage
        /*
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        percentageFormat.format(10929.999);

        */

        //4. Control Number of Digits

        /*
        numberFormat.setMinimumIntegerDigits(int digits)
        numberFormat.setMaximumIntegerDigits(int digits)
        numberFormat.setMinimumFractionDigits(int digits)
        numberFormat.setMaximumFractionDigits(int digits)
        */
    }
}
