package JavaNotesForProfessionals.cap_50_NestedAndInnerClasses.accessModifiersForInnerClasses;

public class SomeOtherClass {
    public static void main(String[] args) {
        int x = new OuterClass().createInner().x;
    }
}
