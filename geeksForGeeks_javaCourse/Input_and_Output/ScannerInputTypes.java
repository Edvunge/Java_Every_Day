package geeksForGeeks_javaCourse.Input_and_Output;

import java.util.Scanner;

public class ScannerInputTypes {
    public static void main(String[] args) {
        /*
        nextBoolean()    ========>>>    usado para ler o valor booleano
        nextByte()       ========>>>    usado para ler o valor do byte
        nextDouble()     ========>>>    usado para leitura de valor double
        nextFloat()      ========>>>    usado para ler o valor flutuante
        nextInt()        ========>>>    usado para ler o valor int
        nextLine()       ========>>>    usado para ler o valor string
        nextLong()       ========>>>    usado para leitura do valor long
        nextShort()      ========>>>    usado para leitura de valor short
        */


        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;
            count++;
        }
        if (count > 0) {
            int mean = sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No integers were input. Mean cannot be calculated.");
        }
        sc.close();
    }
}
