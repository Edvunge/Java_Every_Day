package AulasDoYoutube.broCode.oop.java_Full_Course_2025.chap03_userInput;

import java.util.Scanner;

public class FigureGeometrx {
    public static void main(String[] args) {
        // Calculate area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: " + width);
        width = scanner.nextDouble();

        System.out.print("Enter the heigth: " + width);
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm");

        scanner.close();
    }
}
