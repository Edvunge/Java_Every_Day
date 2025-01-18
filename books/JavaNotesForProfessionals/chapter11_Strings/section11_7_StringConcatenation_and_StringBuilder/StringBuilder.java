package books.JavaNotesForProfessionals.chapter11_Strings.section11_7_StringConcatenation_and_StringBuilder;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder buf = new java.lang.StringBuilder(100);
        for (int i = 0; i < 100; i++) {
            buf.setLength(0); // Empty buffer
            buf.append("This is line ").append(i).append('\n');
            //outputfile.write(buf.toString());
        }
    }
}
