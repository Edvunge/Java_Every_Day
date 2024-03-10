package ZEDlistaDEexercicios.CadernoDeExercicios.B_EXERCiCIOS_LOGICA;

import java.util.Scanner;

public class Exerc19 {
    //  19. Faça um algoritmo que leia um valor inteiro e apresente os resultados do
    //  quadrado e do cubo do valor lido.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int num = input.nextInt();

        int cubo = (num*num*num);

        int resultado = (cubo * cubo);

        System.out.printf("O resultado: %d",resultado);
        input.close();
    }
}
