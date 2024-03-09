package JavaNotesForProfessionals.cap_14_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerSplitSpace {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("apple ball cat dog"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
