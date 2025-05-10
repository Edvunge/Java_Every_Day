package AulasDoYoutube.broCode.oop.java_Full_Course_2025.chap03_userInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello  " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);

        scanner.close();
    }
}
