package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class EscapeSequences {
    public static void main(String[] args) {
        char tab = '\t';
        char backspace = '\b';
        char newline = '\n';
        char carriageReturn = '\r';
        char formafeed = '\f';
        char singQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';
        // char unicodeChar = '\XXXX';

        char heart = '\u2764';
        System.out.println(Character.toString(heart));


        for (int i = 0; i <= 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter);
        }
    }
}
