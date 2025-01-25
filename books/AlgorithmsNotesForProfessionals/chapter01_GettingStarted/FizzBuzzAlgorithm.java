package books.AlgorithmsNotesForProfessionals.chapter01_GettingStarted;

public class FizzBuzzAlgorithm {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int num = 0; num <= number.length; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("(num) fizz buzz");
            } else if (num % 3 == 0){
                System.out.println("(num) fizz");
            } else if (num % 5 == 0) {
                System.out.println("(num) buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}
