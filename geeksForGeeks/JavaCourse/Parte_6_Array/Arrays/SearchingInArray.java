package geeksForGeeks.JavaCourse.Parte_6_Array.Arrays;


public class SearchingInArray {
    int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;

        return -1;
    }
}
