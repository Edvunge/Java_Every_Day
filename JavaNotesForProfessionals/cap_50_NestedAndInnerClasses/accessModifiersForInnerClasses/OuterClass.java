package JavaNotesForProfessionals.cap_50_NestedAndInnerClasses.accessModifiersForInnerClasses;

public class OuterClass {
    public class InnerClass {
        public int x = 5;
    }

    public InnerClass createInner() {
        return new InnerClass();
    }
}
