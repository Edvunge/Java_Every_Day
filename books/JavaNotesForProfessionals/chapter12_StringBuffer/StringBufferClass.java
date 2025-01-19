package books.JavaNotesForProfessionals.chapter12_StringBuffer;

public class StringBufferClass {
    public static void main(String[] args) {
        String str = "study";
        str.concat("tonight");
        System.out.println(str); // saida: study

        StringBuilder strB = new StringBuilder("study");
        strB.append("tonight");
        System.out.println(strB);
    }
}
