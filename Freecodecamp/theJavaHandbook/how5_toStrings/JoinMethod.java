package Freecodecamp.theJavaHandbook.how5_toStrings;

public class JoinMethod {
    public static void main(String[] args) {
        String name = "Edvaldo Vunge";

        String substrings[] = name.split(" ");

        String joinedName = String.join(" ", substrings);

        System.out.println(joinedName);
    }
}
