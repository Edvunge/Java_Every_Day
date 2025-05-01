package Freecodecamp.theJavaHandbook.how7_toConditionalStatement;

public class IfElse_IfElse {
    public static void main(String[] args) {
        int age = 50;
        boolean isSchoolStudent = true;
        boolean isLibraryMember = false;

        if (age >= 18 && age <= 40) {
            System.out.println("You can use the program!");
        } else if (isSchoolStudent || isLibraryMember) {
            System.out.println("you can use the program for a short time");
        } else {
            System.out.println("you can not use the program");
        }
    }
}
