package geeksForGeeks.JavaCourse.Parte_5_Array;

public class ArrayImplementetation {
    public static void main(String[] args) {
        // declares an array of integers
        int[] arr;

        // allocating memory for 5 integers
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elemtents of the array
        arr[1] = 20;

        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accesing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element at index " + i + " : " + arr[i]);
        }
    }
}
