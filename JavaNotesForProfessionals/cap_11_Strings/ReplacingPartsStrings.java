package JavaNotesForProfessionals.cap_11_Strings;

public class ReplacingPartsStrings {
    public static void main(String[] args) {
       // String replace(char oldChar, char newChar);
        String s = "popcorn";
        System.out.println(s.replace('p','W'));

        System.out.println("\n");

        String t = "metal petal et al.";
        System.out.println(t.replace("etal","etallica"));
        System.out.println("\n");

        // REGEX:
        // String replaceAll(String regex, String replacement)

        String s2 = "spiral metal petal et al.";
        System.out.println(s2.replaceAll("(\\w*etal)","$1lica"));
    }
}
