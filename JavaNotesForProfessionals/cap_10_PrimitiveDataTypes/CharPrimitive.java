package JavaNotesForProfessionals.cap_10_PrimitiveDataTypes;

public class CharPrimitive {
    public static void main(String[] args) {
        char myChar = 'u';
        char myChar2 = '5';
        char myChar3 = 65; // myChar3 == 'A'

        char defaultChar; // defaultChar == \u0000

        char tab = '\t';
        char backspace = '\b';
        char newline = '\n';
        char carriageReturn = '\r';
        char formfeed = '\f';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';

        char heart = '\u2764';
        /*
        for(int i = 0; i < 23; i++) {
            System.out.println(" \n " +  Character.toString(heart) );
        }
        */
        for(int i = 0; i <= 26; i++) {
            char letter = (char) ('a' + 1);
            System.out.println(letter);
        }
    }
}
