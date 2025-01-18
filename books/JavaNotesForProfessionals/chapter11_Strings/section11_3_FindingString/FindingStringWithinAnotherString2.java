package books.JavaNotesForProfessionals.chapter11_Strings.section11_3_FindingString;

public class FindingStringWithinAnotherString2 {
    public static void main(String[] args) {
        String s = "this is a long sentence";
        int i = s.indexOf('i');
        int j = s.indexOf("long");
        int k = s.indexOf('z');
        int h = s.indexOf("LoNg");

        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("h: " + h);
    }
}
