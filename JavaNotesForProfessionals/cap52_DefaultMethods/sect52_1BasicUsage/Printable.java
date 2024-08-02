package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_1BasicUsage;

public interface Printable {
    default void printString() {
        System.out.println(  "default implementation"  );
    }
}
