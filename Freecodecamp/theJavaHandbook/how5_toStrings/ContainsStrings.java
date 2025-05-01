package Freecodecamp.theJavaHandbook.how5_toStrings;

public class ContainsStrings {
    public static void main(String[] args) {
        String lyric = "Roses are red, violents are blue";

        if (lyric.contains("blue")) {
            System.out.println("The lyric has the word blue in it.");
        } else {
            System.out.println("The lyric doesn't have the word blue in it.");
        }
    }
}
