package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_6ClassAbstract_IntrfaceMethodPrecedence;

public interface Swim {
    default void backStroke() {
        System.out.println("Swim.backStroke");
    }
}
