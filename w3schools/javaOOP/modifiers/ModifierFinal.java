package w3schools.javaOOP.modifiers;

public class ModifierFinal {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        ModifierFinal myObj = new ModifierFinal();
        //myObj.x = 50;
        //myObj.PI = 25;
        System.out.println(myObj.x);
    }
}
