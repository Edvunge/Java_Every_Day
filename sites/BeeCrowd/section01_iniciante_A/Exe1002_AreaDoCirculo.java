package sites.BeeCrowd.section01_iniciante_A;

import java.util.Scanner;

public class Exe1002_AreaDoCirculo {
    /*
    A fórmula para calcular a área de uma circunferência é: area = π x raio2.
    Considerando para este problema que π = 3.14159:

    - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

    Entrada
    A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

    Saída
    Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
    com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
    Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
    caso contrário, você receberá "Presentation Error".
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("Digite o valor do raio: ");
        double raio = input.nextDouble();

        double areaDoCirculo = PI*(raio*raio);
        System.out.printf("A area do circulo: %.2f" , areaDoCirculo);
    }
}
