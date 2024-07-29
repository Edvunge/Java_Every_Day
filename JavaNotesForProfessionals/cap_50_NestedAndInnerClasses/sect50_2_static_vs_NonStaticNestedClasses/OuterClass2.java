package JavaNotesForProfessionals.cap_50_NestedAndInnerClasses.sect50_2_static_vs_NonStaticNestedClasses;

public class OuterClass2 {

    private int aField;

    //public void aMethod() {}

    private class NestedClass {
        private int innerField;

        private NestedClass() {
            innerField = aField; //Legal
          //aMethod();
            // Legal
        }
    }

    public void aNonStaticMethod() {
        NestedClass s = new NestedClass();
    }

    public static void aStaticMethod() {
        //NestedClass s = new NestedClass();
    }
}
