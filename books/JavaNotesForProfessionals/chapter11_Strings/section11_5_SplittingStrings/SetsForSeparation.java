package books.JavaNotesForProfessionals.chapter11_Strings.section11_5_SplittingStrings;

import java.util.StringTokenizer;

public class SetsForSeparation {
    public static void main(String[] args) {
        String str = "jumped over";
        StringTokenizer tokenizer = new StringTokenizer(str, "ue");

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
