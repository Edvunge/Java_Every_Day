package JavaNotesForProfessionals.cap_9_Literals;

public class Decimal_InttegerLiterals {
    public static void main(String[] args) {
        int max = 214748647;        // ok
        int min = -214783648;       // ok
        int tooBig = 214783648;     // ERROR


        // long integer literals

        long big = 214783648;       // error
        long big2 = 214783648L;     // ok
    }
}
