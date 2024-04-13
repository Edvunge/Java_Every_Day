package ExercsResolvidosDeAlgoritmos.Lista_1.part_3;

import java.util.Scanner;

public class Algoritmo71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hora, tminuto, minuto;

        System.out.println("entre com hora atual: ");
        hora = input.nextInt();

        System.out.println("entre com minutos: ");
        minuto = input.nextInt();

        tminuto = hora*60+minuto;
        System.out.println("Ate agora se passaram: " + tminuto + " minutos ");
        input.close();
    }
}
