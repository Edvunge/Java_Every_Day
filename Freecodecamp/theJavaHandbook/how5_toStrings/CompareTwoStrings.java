package Freecodecamp.theJavaHandbook.how5_toStrings;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String name = "Farhan Hasin Chowdhury";
        String nameUpperCase = name.toUpperCase();

        System.out.println(name.equals(nameUpperCase));

        System.out.println(name.equalsIgnoreCase(nameUpperCase));
    }
}
