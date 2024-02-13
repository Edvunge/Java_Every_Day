package Java_COMPLETO_POO_Projetos.Como_Programar_Java.Cap7_Arrays_ArrayLists;

public class BarChart {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade Distribution:");

        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

            for (int stars = 0; stars < array[counter]; stars++)
                System.out.println("*");

            System.out.println();
        }


    }
}
