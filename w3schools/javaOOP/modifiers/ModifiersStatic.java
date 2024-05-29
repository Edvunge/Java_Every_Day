package w3schools.javaOOP.modifiers;

public class ModifiersStatic {
    // static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod(); // call the static method

        ModifiersStatic modifiersStatic = new ModifiersStatic();
        modifiersStatic.myPublicMethod();
    }
}
