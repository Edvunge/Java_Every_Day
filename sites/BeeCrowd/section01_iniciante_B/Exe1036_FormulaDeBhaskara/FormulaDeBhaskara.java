package sites.BeeCrowd.section01_iniciante_B.Exe1036_FormulaDeBhaskara;

public class FormulaDeBhaskara {
    //
    //
    //
    //


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
    public double delta(double b, double a, double c){
        double delta = ((b*b) - (4*a*c));
        return delta;
    }
    //  delta = b(ao quadrado) - 4*(a)*(c)
    //
    //  x1 = -b + raiz(delta)
    //  x2 = -b - raiz(delta)
    //
    //
}
