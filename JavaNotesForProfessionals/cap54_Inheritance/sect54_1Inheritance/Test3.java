package JavaNotesForProfessionals.cap54_Inheritance.sect54_1Inheritance;

public class Test3 {
    public static void main(String[] args) {
        SubClassInheritsPrivateField s = new SubClassInheritsPrivateField();
        int x = s.getX(); // x will have a value of 5.
    }
}
