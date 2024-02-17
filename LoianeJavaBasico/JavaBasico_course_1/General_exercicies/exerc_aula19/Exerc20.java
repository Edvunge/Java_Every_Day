package LoianeJavaBasico.JavaBasico_course_1.General_exercicies.exerc_aula19;

public class Exerc20 {
    /*
    20.Implementar um programa que obtenha a cotação do dólar (U$) em
    relação ao real (R$) e a seguir armazene em vetor A com 20
    elementos as seguintes conversões:

    21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20.

    22.Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
    0 e 1, sugestão:
    A[i] = (int)Math.round(Math.random() * 1);
    Pede-se para implementar um programa que determine o percentual de
    números 0's e 1's existentes no vetor A.
    */

    public static void main(String[] args) {
        int lengthARRAY = 20;
        int vetA[] = {2, 3, 9, 10, 8, 4, 9, 5, 0, 6};
        double valorDolar, valorReal = 14.5;
        int cotacaoDoDolar = 0;

        valorDolar = (valorReal * 2.3);
        System.out.printf("valor em dolar: %.1f",valorDolar);

        for (int j = 0; j < lengthARRAY; j++) {
            vetA[j] = (cotacaoDoDolar * j);
            System.out.printf("\n vetorA: %d, na posicao: %d ",vetA[j] ,j);
        }
    }
}
