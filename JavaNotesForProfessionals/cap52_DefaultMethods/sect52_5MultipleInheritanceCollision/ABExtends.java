package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_5MultipleInheritanceCollision;

public interface ABExtends extends A, B {
    @Override
    default void foo() {
        System.out.println("ABExtends.foo");
    }
}
