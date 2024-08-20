package ExercsResolvidosDeAlgoritmos.Lista_3.B;

import java.util.Scanner;

public class Algoritmo189 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fi, f2, dec,t;
        double c;

        System.out.printf("\nentre com a temperatura maior em Fahrenheit:");
        fi = input.nextInt();

        System.out.println("\nentre com a temperatura menor em Fahrenheit: ");
        f2 = input.nextInt();

        System.out.println("\nentre com decremento:");
        dec = input.nextInt();

        for ( t = fi; t >= f2; t = t - dec) {
            c = 5 * (t - 32)/9;
            System.out.println("\ntemperatura em graus C&sius: "+ c);
        }
        System.out.printf("\n");
    }
}
