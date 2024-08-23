package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_5MultipleInheritanceCollision;

public interface A {
    default void foo() {
        System.out.println("A.foo");
    }
}
