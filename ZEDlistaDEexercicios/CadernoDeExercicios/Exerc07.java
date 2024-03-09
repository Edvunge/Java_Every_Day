package ZEDlistaDEexercicios.CadernoDeExercicios;

import java.util.Scanner;

public class Exerc07 {
    // 7. Faça um algoritmo para calcular a área de uma circunferência, considerando a
    // fórmula ÁREA = π * RAIO2. Utilize as variáveis AREA e RAIO, a constante π (pi = 3,14159)
    // e os operadores aritméticos de multiplicação.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area = 0.0;
        double raio = 0.0;
        final double PI = 3.14159;

        System.out.println("Digite o valor do raio: ");
        raio = input.nextDouble();

        area = ( PI * (raio * raio));

        System.out.printf("O valor da area da circunferencia eh: %.2g\n",area);
        input.close();
    }
}
