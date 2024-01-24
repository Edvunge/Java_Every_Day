package JavaNotesForProfessionals.cap10_PrimitiveDataTypes;

public class BooleanPrimitive {
    public static void main(String[] args) {
        boolean foo = true;
        System.out.println("foo = " + foo);                            // foo = true

        boolean bar = true;
        System.out.println("bar = " + bar);                            // bar = false

        boolean notFoo = !foo;
        System.out.println("notFoo = " + notFoo);                      // notFoo = false

        boolean fooAndBar = foo && bar;
        System.out.println("fooAndBar = " + fooAndBar);                // fooAndBar = false

        boolean fooOrBar = foo || bar;
        System.out.println("fooOrBar = " + fooOrBar);                  // fooOrBar = true

        boolean fooXorBar = foo ^ bar;
        System.out.println("fooXorBar = " + fooXorBar);                // fooXorBar = true


        boolean defaultBoolean;                                        // defaultBoolean == false
    }
}
