package MaratonaJAVA_DEVdojo.Exercicios.Controle_de_fluxo;

import java.util.Scanner;

public class verificacaoDoTriangulo {
    // Verificação de Triângulo:
    //	Peça os comprimentos dos lados de um triângulo e determine se é equilátero, isósceles ou escaleno.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 3 comprimentos de um triangulo.");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        /*
        equilatero: 3 lados iguais
        isosceles: dois lados iguais
        escaleno: todos os lados diferentes
        */
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.printf("Os %.1f, %.1f e %.1f sao iguais, logo trata-se de um triangulo Equilatero.", lado1, lado2, lado3);
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.printf("Dois lados entre %.1f, %.1f e %.1f sao iguais, logo trata-se de um triangulo Isosceles.", lado1, lado2, lado3);
        } else {
            System.out.printf("Os %.1f, %.1f e %.1f sao diferentes, logo trata-se de um triangulo Escaleno.", lado1, lado2, lado3);
        }
        sc.close();
    }
}