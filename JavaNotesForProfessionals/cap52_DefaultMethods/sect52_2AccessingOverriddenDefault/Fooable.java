package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_2AccessingOverriddenDefault;

public interface Fooable {
    default int foo() {
        return 3;
    }
}
