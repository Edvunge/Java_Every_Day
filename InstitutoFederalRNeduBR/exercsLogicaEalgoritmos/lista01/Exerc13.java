package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc13 {
    // 13. leia dois valores(catetos de um triângulo retângulo) e imprima a hipotenusa.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor do primeiro numero: ");
        double catetoADJ = sc.nextDouble();

        System.out.println("digite o valor do primeiro numero: ");
        double catetoOPST = sc.nextDouble();

        double hipotenusa = catetoADJ/catetoOPST;
        System.out.println("hipotenusa: " + hipotenusa);
    }
}
