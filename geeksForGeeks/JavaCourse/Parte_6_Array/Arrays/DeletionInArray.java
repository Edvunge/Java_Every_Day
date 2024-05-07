package geeksForGeeks.JavaCourse.Parte_6_Array.Arrays;

public class DeletionInArray {

    static int findElement(int arr[], int n, int key) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }


    static int deleteElement(int arr[], int n, int key) {
        int pos = findElement(arr, n, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        // deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        return n - 1;
    }

    public static void main(String[] args) {
    }
}
