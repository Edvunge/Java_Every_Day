package geeksForGeeks.JavaCourse.Parte_6_Array.Arrays;

public class InsertElementArray {

    static void insertElement(int arr[], int n, int x, int pos) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    public static void main(String[] args) {

    }
}
