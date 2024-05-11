package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.lista01;

import java.util.Scanner;

public class Exerc12 {
    // 12. calcule e imprima a área de um trapézio.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite o valor da base maior: ");
        double baseMaior = input.nextDouble();

        System.out.println("digite o valor da base menor: ");
        double baseMenor = input.nextDouble();

        System.out.println("digite o valor da altura: ");
        double altura = input.nextDouble();


        double areaDoTrapezio = ( (baseMaior + baseMenor) * altura )/2;
        System.out.println("A area do trapezio: " + areaDoTrapezio);
        /*

        A = ( B + b ) * H / 2

        onde:

        A = areaDoTrapezio
        B = baseMaior
        b = baseMenor
        H = altura

        */

    }
}
