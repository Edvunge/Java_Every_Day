package JavaProgrammingMasterclass.section_5_ExpressionsStatements;

public class CodeBlocksAndTheIfThenElseControlStatement {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComleted =5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }
    }
}
