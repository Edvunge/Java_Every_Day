package Freecodecamp.theJavaHandbook.how7_toConditionalStatement;

public class Main {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18 && age <= 40) {
            boolean isSchoolStudent = true;
            boolean isLibraryMember = false;

            if (isSchoolStudent || isLibraryMember) {
                System.out.println("You can use the program");
            }
        } else {
            System.out.println("You can not use the program");
        }
    }
}
