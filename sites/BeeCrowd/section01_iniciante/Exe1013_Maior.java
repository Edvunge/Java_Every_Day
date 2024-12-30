package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Exe1013_Maior {
    /*
        Faça um programa que leia três valores e apresente o maior dos três valores lidos
        seguido da mensagem “eh o maior”. Utilize a fórmula:
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 3 valores em inteiros: ");
        int value_A = input.nextInt();
        int value_B = input.nextInt();
        int value_C = input.nextInt();

        int maiorAB = ( (value_A+value_B+abs(value_A-value_B) )/2 );
        int maiorAC = ( (maiorAB+value_C+abs(maiorAB-value_C) )/2 );

        if (maiorAB > maiorAC)
            System.out.println(maiorAB+" eh o maior");
        else
            System.out.println(maiorAC+" eh o maior");
    }
}
