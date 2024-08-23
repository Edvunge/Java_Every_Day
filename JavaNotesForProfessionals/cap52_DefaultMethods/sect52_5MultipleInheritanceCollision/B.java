package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_5MultipleInheritanceCollision;

public interface B {
    default void foo() {
        System.out.println("B.foo");
    }
}
