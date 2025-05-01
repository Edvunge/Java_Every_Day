package Freecodecamp.theJavaHandbook.how5_toStrings;

public class MainEmpty {
    public static void main(String[] args) {
        String name = "Farhan";

        if (name.isEmpty()) {
            System.out.println("There is no name mentioned here");
        } else {
            System.out.println(String.format("Okay, I'll take care of %s.", name));
        }
    }
}
