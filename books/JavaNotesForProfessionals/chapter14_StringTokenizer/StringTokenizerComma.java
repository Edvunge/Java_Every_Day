package books.JavaNotesForProfessionals.chapter14_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerComma {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("apple,ball cat,dog",",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
