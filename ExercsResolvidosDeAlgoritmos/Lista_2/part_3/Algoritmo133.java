package ExercsResolvidosDeAlgoritmos.Lista_2.part_3;

import java.util.Scanner;

public class Algoritmo133 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sexo;
        double h, peso;

        System.out.println("\nEntre com a altura: ");
        h = input.nextDouble();

        System.out.println("\nEntre com o sexo: M/F: ");
        sexo = input.next();

        if (sexo.equals("M") || sexo.equals("m")) {
            peso = 72.7f*h - 58;
        } else {
            peso = 62.1*h - 44.7;
        }
        System.out.printf("\nseu peso ideial: %.2f" , peso);
        System.out.println("\n");
    }
}
