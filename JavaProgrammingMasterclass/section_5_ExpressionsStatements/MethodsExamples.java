package JavaProgrammingMasterclass.section_5_ExpressionsStatements;

public class MethodsExamples {
    public static void main(String[] args) {
        calculateScore();
    }


    public static void calculateScore() {
        // method body
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        double finalScore = score;
        boolean gameOver = false;

        if (!gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
