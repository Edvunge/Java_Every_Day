package geeksForGeeks.JavaCourse.Parte_5_String;

public class StringAnother {
    public static void main(String[] args) {
        char characters[] = { 'G', 'f', 'g'};

        String firstString = new String(characters);
        String secondString = new String(firstString);

        System.out.println(firstString);
        System.out.println(secondString);
    }
}