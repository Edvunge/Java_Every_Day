package ExercsResolvidosDeAlgoritmos.Lista_1;

import java.util.Scanner;

public class Algoritmo50 {
    public static void main(String[] args) {
        // Entrar com base e a altura de um retangulo imprimir a segunda a seguinte saida:
        // perimetro:
        // area:
        // diagonal:
        Scanner input = new Scanner(System.in);
        double perimetro, area, diagonal, base, altura;

        System.out.println("digite a base: ");
        base = input.nextDouble();

        System.out.println("digite a altura: ");
        altura = input.nextDouble();

        perimetro = 2* (base + altura);
        area = base * altura;
        diagonal = Math.sqrt(base*2 + altura*2);

        System.out.println("perimetro: " + perimetro);
        System.out.println("area: " + area);
        System.out.println("diagonal: " + diagonal);
    }
}
