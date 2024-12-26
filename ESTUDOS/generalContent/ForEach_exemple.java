package ESTUDOS.generalContent;

public class ForEach_exemple {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int i : numeros3) {
            System.out.println(i);
        }
    }
}
