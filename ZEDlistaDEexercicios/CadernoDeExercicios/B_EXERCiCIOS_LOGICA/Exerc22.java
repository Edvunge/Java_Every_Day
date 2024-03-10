package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc22 {
    //22. Faça um algoritmo que leia dois números nas variáveis Val1 e Val2, calcule sua
    //média na variável Media e imprima seu valor.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double val1 = input.nextDouble();

        System.out.println("Digite o primeiro valor: ");
        double val2 = input.nextDouble();

        double media = (val1 + val2/2);
        System.out.printf("Media: %.2f",media);
        input.close();
    }
}
