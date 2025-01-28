package ESTUDOS.ArraysMultidimensionais;

import java.util.Scanner;

public class CompareTwoNumbers_In_Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2, 4, 6, 8, 10, 12, 14, 16
        final int LEN = 4;
        int[][] numbers = new int[LEN][LEN];

        for (int h = 0; h < LEN; h++) {
            for (int y = 0; y < LEN; y++) {
                System.out.printf("Digite [%d][%d] para matrix: ",h ,y );
                numbers[h][y] = input.nextInt();
            }
        }

        for (int x = 0; x < LEN; x++) {
            for (int r = 0; r < LEN; r++) {
                if (numbers[2][2] > numbers[3][3]) {
                    System.out.println(numbers[2][2] + " o maior numero.");
                } else if (numbers[3][3] < numbers[2][2]){
                    System.out.println(numbers[2][2] + " o maior numero.");
                } else {
                    System.out.println(numbers[2][2] + " e " + numbers[3][3] + " são iguais.");
                }
                break;
            }
        }
    }
}
