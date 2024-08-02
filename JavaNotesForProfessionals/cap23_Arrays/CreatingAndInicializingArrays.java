package JavaNotesForProfessionals.cap23_Arrays;

public class CreatingAndInicializingArrays {
    public static void main(String[] args) {
        // Basic Cases
        int[] numbers1 = new int[3];
        int[] numbers2 = { 1, 2, 3 };
        int[] numbers3 = new int[] { 1, 2, 3 };
        int[][] numbers4 = { { 1, 2 }, { 3, 4, 5 } };
        int[][] numbers5 = new int[5][];
        int[][] numbers6 = new int[5][4]; // 5x4


        float[] boats = new float[5];
        double[] header = new double[] { 4.56, 332.267, 7.0, 0.3367, 10.0 };

        String[] theory = new String[] { "a", "b", "c" };
       // Object[] dArt = new Object[] { new Object(), "We love Stack Overflow.", new Integer(3) };
    }
}
