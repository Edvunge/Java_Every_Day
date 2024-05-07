package ESTUDOS.ARRAYS_exrcs;

import java.util.Scanner;

public class ArraysDeStrings {
    public static void main(String[] args) {
        // lista de nomes.
        Scanner input = new Scanner(System.in);

        String[] nomes = {"Ana", "Edna", "Elisa", "Helena", "Eduardo"};

        for (String varios : nomes) {
            System.out.println(varios);
        }
        input.close();
    }
}
