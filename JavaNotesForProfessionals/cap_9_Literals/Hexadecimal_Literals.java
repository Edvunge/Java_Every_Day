package JavaNotesForProfessionals.cap_9_Literals;

public class Hexadecimal_Literals {
    public static void main(String[] args) {
        int dec = 110;             //  no prefix  --> decimal literal
        int bin = 0b1101110;       // '0b' prefix --> binary literal
        int oct = 0156;            // '0'  prefix --> octal literal
        int hex = 0x6E;            // '0x' prefix --> hexadecimal literal

        int a = 0100;              //  Instead of 100, a == 64
    }
}
