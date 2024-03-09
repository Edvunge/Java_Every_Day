package JavaNotesForProfessionals.cap_11_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingOccurrencesSubstring {

    public static int countStringInString(String search, String text) {
        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(text);

        int strimgOccurreces = 0;
        while (matcher.find()) {
            strimgOccurreces++;
        }
        return strimgOccurreces;
    }

    public static void main(String[] args) {

        String text = "One fish, two fish, red fish, blue";
        System.out.println(countStringInString("fish", text));
        System.out.println(countStringInString(",", text));
    }
}
