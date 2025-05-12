package AulasDoYoutube.broCode.oop.java_Full_Course_2025.chap07_ifStatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // if statement
        int age;
        String name;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter you age: ");
        age = scanner.nextInt();

        if(age >= 65){
            System.out.println("You are a senior!");
        } else if(age >= 18){
            System.out.println("You are an adult!");
        } else if (age < 0){
            System.out.println("You haven't been born yet!");
        } else if (age == 0){
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child!");
        }

        scanner.close();
    }
}
