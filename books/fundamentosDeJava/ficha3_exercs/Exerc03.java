package books.fundamentosDeJava.ficha3_exercs;

import java.util.Scanner;

public class Exerc03 {
    //  3 Construa um programa que, tendo como dados de entrada a altura (H) e o sexo (S) de
    //  uma pessoa calcule e apresente o seu peso ideal utilizando as seguintes fórmulas:
    //  Para homens: Peso ideal (P) = (72,7 * H) – 58
    //  Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite a sua altura: ");
        double altura = input.nextDouble();

        System.out.println("digite o seu sexo: ");
        String sexo = input.next();

        double pesoIdeial;

        if (sexo.equals("m") || sexo.equals("M")) {
            pesoIdeial = (72.7 * altura) - 58;
            System.out.println("Ola Sr.");
            System.out.println("o seu peso ideial eh: " + pesoIdeial);
        } else if (sexo.equals("f") || sexo.equals("F")) {
            pesoIdeial = (62.1 * altura) - 44.7;
            System.out.println("Ola Sra.");
            System.out.println("o seu peso ideial eh: " + pesoIdeial);
        }
        input.close();
    }
}
