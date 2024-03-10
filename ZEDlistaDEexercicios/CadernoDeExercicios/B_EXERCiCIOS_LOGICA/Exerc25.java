package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc25 {
    //  25. Faça um algoritmo que leia dois números inteiros (Int1 e Int2) e imprima o
    //  quociente e o resto da divisão inteira de Int1 por Int2.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int int1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int int2 = input.nextInt();

        double quociente = (double) (int1 / int2);
        double resto = int1 % int2;

        System.out.printf("Quociente: %.2f\n",quociente);
        System.out.printf("Resto: %.2f\n",resto);
        input.close();
    }
}
