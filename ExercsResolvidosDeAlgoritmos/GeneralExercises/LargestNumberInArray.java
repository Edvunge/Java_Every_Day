package ExercsResolvidosDeAlgoritmos.GeneralExercises;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 39, 34};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
}
