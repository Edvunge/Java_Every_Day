package JavaNotesForProfessionals.cap50_NestedAndInnerClasses.sect50_6_MethodLocal_InnerClasses;

public class OuterClass {
    private void outerMethod() {
        final int outerInt = 1;
            // Method Local Inner Class
        class MethodLocalInnerClass {
            private void print() {
                System.out.println("Method Local Inner Class " + outerInt);
            }
        }
        // Accessing the inner class
        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.print();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }
}
