package JavaNotesForProfessionals.cap_23_Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] a = new int[2][3];

        int[][] a1 = { {1, 2}, {3, 4}, {5, 6} };

        for (int i = 0; i < a1.length; i++){
            System.out.println(i); // 0, 1, 2
        }

        int[][] a3 = { {1}, {2, 3}, null };
    }
}
