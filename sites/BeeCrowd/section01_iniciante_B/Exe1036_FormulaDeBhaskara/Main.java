package sites.BeeCrowd.section01_iniciante_B.Exe1036_FormulaDeBhaskara;

import java.util.Scanner;

public class Main {
    /*
    Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
    Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
    caso haja uma divisão por 0 ou raiz de numero negativo.

    Entrada
        Leia três valores de ponto flutuante (double) A, B e C.

    Saída
        Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
        Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto,
        com uma mensagem correspondente conforme exemplo abaixo.
        Imprima sempre o final de linha após cada mensagem.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FormulaDeBhaskara formulaDeBhaskara = new FormulaDeBhaskara();

        // ponto flutuante (double) A, B e C.
        System.out.println("Digite o coeficiente A: ");
        double valorA = input.nextDouble();

        System.out.println("Digite o coeficiente B: ");
        double valorB = input.nextDouble();

        System.out.println("Digite o coeficiente C: ");
        double valorC = input.nextDouble();

        //formulaDeBhaskara.delta(valorA, valorB, valorC);

        //  delta = b(ao quadrado) - 4*(a)*(c)
        //
        //  x1 = -b + raiz(delta)
        //  x2 = -b - raiz(delta)
        //

        /*
    3. Resolver a raiz quadrada:

    Calcula-se primeiro o valor dentro da raiz quadrada (b² - 4ac), que é chamado de discriminante (Δ).
        Se Δ for positivo, existem duas raízes reais e distintas.
        Se Δ for zero, existe uma raiz real (duas raízes reais iguais).
        Se Δ for negativo, não existem raízes reais.

        */


        double x1 = (-valorB + Math.sqrt(formulaDeBhaskara.delta(valorA, valorB, valorC)) / 2*valorA);
        double x2 = (-valorB - Math.sqrt(formulaDeBhaskara.delta(valorA, valorB, valorC)) / 2*valorA);

        System.out.println("O valor da primeira raiz: " + x1);
        System.out.println("O valor da segunda raiz: " + x2);

        /*
        A fórmula de Bhaskara, ou fórmula quadrática,
        é um método para encontrar as raízes de uma equação do segundo grau,
                que é representada na forma ax² + bx + c = 0. A fórmula é:


        x = (-b ± √(b² - 4ac)) / 2a

        onde a, b e c são os coeficientes da equação quadrática.


    Explicação Detalhada:

        1. Identificar os coeficientes:
                        Na equação ax² + bx + c = 0, 'a' é o coeficiente de x², 'b'
                        é o coeficiente de x, e 'c' é o
                        termo constante (ou termo independente).


        2. Aplicar a fórmula:
                        Substituir os valores de a, b e c na fórmula de Bhaskara:
                        x = (-b ± √(b² - 4ac)) / 2a


        3. Resolver a raiz quadrada:

    Calcula-se primeiro o valor dentro da raiz quadrada (b² - 4ac), que é chamado de discriminante (Δ).
        Se Δ for positivo, existem duas raízes reais e distintas.
        Se Δ for zero, existe uma raiz real (duas raízes reais iguais).
        Se Δ for negativo, não existem raízes reais.


        4. Calcular as raízes:
            Uma vez calculado o valor de √(b² - 4ac), divide-se (-b ± √(b² - 4ac)) por 2a.
            O sinal "±" indica que existem duas soluções:
                uma com o sinal positivo da raiz e outra com o sinal negativo.



        Exemplo:

        Considere a equação 2x² + 5x - 3 = 0. a = 2, b = 5, c = -3.

        Aplicando a fórmula:
        x = (-5 ± √(5² - 4 * 2 * -3)) / (2 * 2)
        x = (-5 ± √(25 + 24)) / 4
        x = (-5 ± √49) / 4
        x = (-5 ± 7) / 4

        As duas raízes são:
        x1 = (-5 + 7) / 4 = 2 / 4 = 1/2
        x2 = (-5 - 7) / 4 = -12 / 4 = -3


        Portanto, as raízes da equação são 1/2 e -3.

        Em resumo, a fórmula de Bhaskara é uma ferramenta essencial para resolver equações do segundo grau,
        fornecendo as soluções (raízes) a partir dos coeficientes da equação.
        */
        input.close();
    }
}
