package books.JavaNotesForProfessionals.chapter21_NumberFormat;

import java.util.Locale;

public class NumberFormat {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "IN");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
    }

    private static NumberFormat getInstance(Locale locale) {
        return null;
    }
}
