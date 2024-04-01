package JavaNotesForProfessionals.cap_23_Arrays;

public class IteratingOverArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        array[0] =  3;
        array[1] =  30;
        array[2] =  31;
        array[3] =  32;
        array[4] =  33;
        array[5] =  34;
        array[6] =  35;
        array[7] =  36;
        array[8] =  37;
        array[9] =  38;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
