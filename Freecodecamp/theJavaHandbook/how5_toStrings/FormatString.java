package Freecodecamp.theJavaHandbook.how5_toStrings;

public class FormatString {
    public static void main(String[] args) {
        String name = "Farhan";
        int age = 27;

        String formattedString = String.format("My name is %s and I'm %d years old.", name, age);

        System.out.println(formattedString);
    }
}
