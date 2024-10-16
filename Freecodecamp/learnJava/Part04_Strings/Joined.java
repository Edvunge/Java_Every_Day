package Freecodecamp.learnJava.Part04_Strings;

public class Joined {
    public static void main(String[] args) {
        String name = "Farhan Hasin Chowdhury";

        String substrings[] = name.split(" ");

        String joinedName = String.join("", substrings);

        System.out.println(joinedName);
    }
}
