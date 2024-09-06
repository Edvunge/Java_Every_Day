package JavaNotesForProfessionals.cap54_Inheritance.sect54_11InheritanceStaticMethods;

public class StaticMethodTest {
    public static void main(String[] args) {
            Parent p = new Child();
            p.staticMethod();
            ((Child) p).staticMethod();
    }
}
