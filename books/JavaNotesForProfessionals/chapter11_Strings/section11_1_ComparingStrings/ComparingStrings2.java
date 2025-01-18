package books.JavaNotesForProfessionals.chapter11_Strings.section11_1_ComparingStrings;

import java.util.Locale;

public class ComparingStrings2 {
    public static void main(String[] args) {
        String firstString = "Taki";
        String secondString = "TAKI";

        System.out.println(firstString.equalsIgnoreCase(secondString));

        Locale locale = Locale.forLanguageTag("tr-TR");

        System.out.println(firstString.toLowerCase(locale).equals(secondString.toLowerCase(locale)));
    }
}
