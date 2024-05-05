package geeksForGeeks.JavaCourse.Parte_6_Array;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // syntax
        int[][] arr = new int[3][3];
        // 3 row and 3 column

        // Number of Rows
        System.out.println("Number of Rows:" + arr.length);

        // Number of Columns
        System.out.println("Number of Columns:" + arr[0].length);
    }
}
