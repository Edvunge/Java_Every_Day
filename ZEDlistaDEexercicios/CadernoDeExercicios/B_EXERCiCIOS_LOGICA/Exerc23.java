package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc23 {
    //  23. Faça um algoritmo que leia dois números nas variáveis NumA e NumB, nessa
    //  ordem, e imprima em ordem inversa, isto é, se os dados lidos forem 5 e 9, por
    //  exemplo, devem ser impressos na ordem 9 e 5.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Primeiro: ");
        int numA = input.nextInt();

        System.out.println("Digite o Segundo: ");
        int numB = input.nextInt();

        int valAUX = numA;
        numA = numB;
        numB = valAUX;

        System.out.println("numA: " + numA);
        System.out.println("numB: " + numB);
        input.close();
    }
}
