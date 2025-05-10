package AulasDoYoutube.broCode.oop.java_Full_Course_2025.chap02_variables;

public class Aula02_Variables {
    public static void main(String[] args) {
        // Variables = a reusable container for a value
        //             a variable behaves as if it was the value contains

        // 2 Steps to creating a variable
        // -------------------------------
        // 1. declaration
        // 2. assignment

        int age = 32;
        int year = 2025;
        int quantity = 3;


        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;


        char grade = 'A';
        char symbol = '!';
        char currency = '$';


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        /*
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are NOT a student!");
        }

        */

        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "Blue";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your email is:  " + email);
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);


    }
}
