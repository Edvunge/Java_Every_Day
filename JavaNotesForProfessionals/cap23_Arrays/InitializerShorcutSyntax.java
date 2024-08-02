package JavaNotesForProfessionals.cap23_Arrays;

public class InitializerShorcutSyntax {
    public static void main(String[] args) {
        // First initialization of array
        int[] array = new int[] { 1, 2, 3 };

        for (int i : array) {
            System.out.println(i + " ");
        }

        array = new int[] { 4, 5, 6 };

        for (int i : array) {
            System.out.println(i + " ");
        }

        //array = { 1, 2, 3, 4 };
    }
}
