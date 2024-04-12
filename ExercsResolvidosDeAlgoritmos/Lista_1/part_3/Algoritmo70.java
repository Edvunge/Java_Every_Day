package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cres, cgorj;

        System.out.println("entre com o valor da conta: ");
        cres = input.nextDouble();

        cgorj = cres * 1.1;

        System.out.println("O valor da conta com a gorjeta sera: " + cgorj*2);
        input.close();
    }
}
