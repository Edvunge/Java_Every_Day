package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1011_Esfera {
    /*
    Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
    A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.

    Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3),
    pois algumas linguagens (dentre elas o C++),
    assumem que o resultado da divisão entre dois inteiros é outro inteiro.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Digite o valor do raio: ");
        double raio = input.nextDouble();

        double volume = (((double) 4 /3) * PI * (raio * raio * raio));
        System.out.printf("O VALOR DO VOLUME DA ESFERA: %.2f",volume);
    }
}
