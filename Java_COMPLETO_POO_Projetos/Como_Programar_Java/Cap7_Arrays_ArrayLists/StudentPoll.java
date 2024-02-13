package Java_COMPLETO_POO_Projetos.Como_Programar_Java.Cap7_Arrays_ArrayLists;

public class StudentPoll {
    public static void main(String[] args) {
        int[] responses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20};
        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("   responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for (int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d%n", rating, frequency[rating]);

    }
}