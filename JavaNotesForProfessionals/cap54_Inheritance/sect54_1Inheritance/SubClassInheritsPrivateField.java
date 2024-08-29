package JavaNotesForProfessionals.cap54_Inheritance.sect54_1Inheritance;

public class SubClassInheritsPrivateField extends BaseClassWithPrivateField {
    public void printX() {
       // System.out.println(x);      // Illegal, can't acess private field x
        System.out.println(getX()); // Legal, prints 5
    }
}
