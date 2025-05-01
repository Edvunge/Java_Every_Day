package Freecodecamp.theJavaHandbook.how4_toOperators;

public class MultipleOperators {
    public static void main(String[] args) {
        boolean isSchoolStudent = true;
        boolean isLibraryMember = false;
        int age = 10;

        System.out.println(isSchoolStudent || isLibraryMember && age > 18);
    }
}
