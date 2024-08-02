package JavaNotesForProfessionals.cap52_DefaultMethods.sect52_2AccessingOverriddenDefault;

public class A extends Object implements Fooable {
    @Override
    public int foo() {
        return Fooable.super.foo() + 1;
    }
}
