package JavaProgrammingMasterclass.section_4_IntellijBasics;

public class ExampleIfStatement {
    public static void main(String[] args) {
        System.out.println("Hello, Edvaldo");

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore > 100) {
            System.out.println("you got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}
