package ZEDlistaDEexercicios.CadernoDeExercicios;

import java.util.Scanner;

public class Exerc08 {
    // 8. Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula
    //. Utilize as variáveis AREA, BASE e ALTURA e os
    //operadores aritméticos de multiplicação e divisão.
    public static void main(String[] args) {
        //areaDoTriangulo
        //base
        //altura
        Scanner input = new Scanner(System.in);
        double areaDoTriangulo = 0.0;
        double base = 0.0, altura = 0.0;

        System.out.println("Digite o valor da base: ");
        base = input.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = input.nextDouble();

        areaDoTriangulo = ((base * altura)/2);

        System.out.format("Area do triangulo: %.2g ",areaDoTriangulo);
        input.close();
    }
}
