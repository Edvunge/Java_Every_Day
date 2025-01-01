package sites.BeeCrowd.section01_iniciante;

import java.util.Scanner;

public class Exe1015_DistanciaEntreDoisPontos {
    /*
    Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
    p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
    mostrando 4 casas decimais, segundo a fórmula:
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite quatro (4) valores inteiros: ");
        double value1 = input.nextDouble();
        double value2 = input.nextDouble();
        double value3 = input.nextDouble();
        double value4 = input.nextDouble();

        double distancia = Math.sqrt((((value2 - value1)*(value2 - value1)) + ((value4 - value3)*(value2 - value1))));

        System.out.printf("O valor da distancia eh: %.2f" , distancia);
    }
}
