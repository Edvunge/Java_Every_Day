package JavaProgrammingMasterclass.section_4_IntellijBasics;

public class LogicalORoperator {
    public static void main(String[] args) {
        // logical operator

        int secondTopScore = 81, topScore = 9;
        if ( (topScore > secondTopScore) && (topScore < 100) ) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ( (topScore > 90) || (secondTopScore <= 90) ) {
            System.out.println("\nEither or both of the conditions are true");
        }
    }
}
