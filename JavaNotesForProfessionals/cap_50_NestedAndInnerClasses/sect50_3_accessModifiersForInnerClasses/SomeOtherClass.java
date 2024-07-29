package JavaNotesForProfessionals.cap_50_NestedAndInnerClasses.sect50_3_accessModifiersForInnerClasses;

public class SomeOtherClass {
    public static void main(String[] args) {
        int x = new OuterClass().createInner().x;
    }
}
