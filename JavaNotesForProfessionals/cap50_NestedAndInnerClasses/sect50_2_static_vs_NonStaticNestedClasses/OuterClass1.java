package JavaNotesForProfessionals.cap50_NestedAndInnerClasses.sect50_2_static_vs_NonStaticNestedClasses;

public class OuterClass1 {

    private int aField;
    public void aMethod(){}

    private static class StaticNestedClass {
        private int innerField;

        private StaticNestedClass() {
            //innerField = aField;
            //aMethod();
        }

        private StaticNestedClass(OuterClass1 instance) {
            innerField = instance.aField; //Legal
        }
    }

    public static void aStaticMethod() {
        StaticNestedClass s = new StaticNestedClass();
    }
}
