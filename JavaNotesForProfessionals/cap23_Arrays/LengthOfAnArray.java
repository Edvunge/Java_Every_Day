package JavaNotesForProfessionals.cap23_Arrays;

public class LengthOfAnArray {
    public static void main(String[] args) {
        int[] arr1 = new int[0];
        int[] arr2 = new int[2];
        int[] arr3 = new int[] {1, 2, 3, 4};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7};

        int len1 = arr1.length; // 0
        int len2 = arr2.length; // 2
        int len3 = arr3.length; // 4
        int len4 = arr4.length; // 7
    }
}
