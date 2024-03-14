package JavaProgrammingMasterclass.section_3_FirstSteps;

public class StartingOutExpressions {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        System.out.printf("myFirstNumber: %d\n",myFirstNumber);
        System.out.printf("mySecondNumber: %d\n",mySecondNumber);
        System.out.printf("myThirdNumber: %d\n",myThirdNumber);
        System.out.printf("myTotal: %d\n",myTotal);
        System.out.printf("myLastOne: ",myLastOne);
    }
}
