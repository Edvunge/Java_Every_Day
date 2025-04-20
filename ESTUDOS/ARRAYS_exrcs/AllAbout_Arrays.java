package ESTUDOS.ARRAYS_exrcs;

import java.util.Scanner;

public class AllAbout_Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 22, 23, 24, 25, 27, 28, 29. 21
        //int[] vet = {22, 23, 24, 25, 27, 28, 29, 21};
        int[] vet = new int[8];

        for (int u = 0; u < 8; u++) {
            System.out.printf("pos [%d]: %d\n", u ,vet[u]);
            vet[u] = input.nextInt();
        }
    }
}
