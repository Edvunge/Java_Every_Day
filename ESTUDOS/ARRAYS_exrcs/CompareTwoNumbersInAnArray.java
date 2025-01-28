package ESTUDOS.ARRAYS_exrcs;

public class CompareTwoNumbersInAnArray {
    public static void main(String[] args) {
        // 2, 4, 6, 8, 10, 12, 14, 16
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[2] > numbers[3]) {
                System.out.println(numbers[2] + " o maior numero.");
            } else if (numbers[3] < numbers[2]){
                System.out.println(numbers[2] + " o maior numero.");
            } else {
                System.out.println(numbers[2] + " e " + numbers[3] + " são iguais.");
            }
            break;
        }
    }
}
