package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.Lista03;

import java.util.Scanner;

public class Exerc07 {
    //7. ler cinco números e imprimir a metade de cada um deles.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int metadeDeCadaNumero = 0;

        for (int n = 0; n <= 5; n++) {
            System.out.printf("digite o %d elemento: " , n);
            n = input.nextInt();

            metadeDeCadaNumero = n/2;
            System.out.println("Metade De Cada numero: "+ metadeDeCadaNumero);
        }
    }
}
