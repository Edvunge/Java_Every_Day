package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_3useDefaultMethods;

public interface Swim {
    void backStroke();
    default void sideStroke() {
        System.out.println("Default sidestroke implementation. Can be overridden");
    }
}
