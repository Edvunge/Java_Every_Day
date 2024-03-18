package JavaProgrammingMasterclass.section_5_ExpressionsStatements;

public class KeyWorldAndExpressions {
    public static void main(String[] args) {
        int age = 9;
        // int int = 90; int eh uma palavra reservada, por isso nao pode ser usada como nome de variavel
        System.out.println("HEllo, world of java keyWorld expressions!");
        System.out.println("there is a cloths");


        double kilometers = (100 * 1.8989);
        System.out.printf(" %.2f ", kilometers);

        int highScore = 43;

        if (highScore > 25) {
            highScore = 1000 + highScore;
            System.out.println(highScore);
        }

        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            health = highScore - 100;
            System.out.println(health);
        }
    }
}
