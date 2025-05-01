package Freecodecamp.theJavaHandbook.how4_toOperators;

public class MainBoolean {
    public static void main(String[] args) {
        boolean isLibraryMember = true;
        boolean isSchoolStudent = false;

        System.out.println(!isSchoolStudent || isLibraryMember);
        System.out.println(!(isSchoolStudent || isLibraryMember));
    }
}
