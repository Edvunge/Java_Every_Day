package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso, pesoGramas, novoPeso;

        System.out.println("entre com seu peso, so a parte inteira: ");
        peso = input.nextInt();

        pesoGramas = peso * 1000;
        novoPeso = (int) (pesoGramas*1.12);

        System.out.println("peso em gramas: " + pesoGramas);
        System.out.println("novo peso: " + novoPeso);
        input.close();
    }
}
