package Freecodecamp.learnJava.Part03_operators;

public class IsLogical {
    public static void main(String[] args) {
        boolean isSchoolStudent = true;
        boolean isLibraryMember = false;
        int age = 10;

        System.out.println(isSchoolStudent || isLibraryMember && age > 18);
    }
}
