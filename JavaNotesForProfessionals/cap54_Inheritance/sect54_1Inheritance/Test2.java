package JavaNotesForProfessionals.cap54_Inheritance.sect54_1Inheritance;

public class Test2 {
    public static void main(String[] args) {
        SubClass2 s2 = new SubClass2();
        s2.baseMethod();        // Still valid, prints "Doing base class stuff"
        s2.anotherMethod();     // Also valid, prints "Doing base class stuff"
    }
}
