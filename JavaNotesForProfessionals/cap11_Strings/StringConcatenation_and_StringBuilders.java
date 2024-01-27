package JavaNotesForProfessionals.cap11_Strings;

import jdk.internal.module.ModuleInfoExtender;

public class StringConcatenation_and_StringBuilders {
    public static void main(String[] args) {
        // concatenando usando o operador +
        /*String s1 = "a";
        String s2 = "a";
        String s3 = "a";
        String s = s1 + s2 + s3; // abc */

        StringBuilder sb = new StringBuilder("a");
        String s = sb.append("b").append("c").toString();


        /*StringBuilder buf = new StringBuilder(100);
        for (int i = 0; i < 100; i++) {
            buf.setLength(0); // Empty buffer
            buf.append("This is line ").append(i).append('\n');
            ModuleInfoExtender outputfile = null;
            outputfile.write(buf.toString());
        }*/
    }
}
