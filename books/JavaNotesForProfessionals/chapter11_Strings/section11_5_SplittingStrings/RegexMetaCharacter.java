package books.JavaNotesForProfessionals.chapter11_Strings.section11_5_SplittingStrings;

import java.util.regex.Pattern;

public class RegexMetaCharacter {
    public static void main(String[] args) {
        // Using Pattern.quote
        String s = "a|b|c";
        String regex = Pattern.quote("|");
        String[] arr = s.split(regex);
        System.out.println("s: " + s);
        System.out.println("regex: " + regex);
        System.out.println("arr: " + arr);

        // Escaping the special characters
        String s1 = "a|b|c";
        String[] arr1 = s.split("\\|");
    }
}
