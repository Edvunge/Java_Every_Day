package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

public class Exerc89 {
    public static void main(String[] args) {
        //  89. Construa um Algoritmo que, para um grupo de 50 valores inteiros, determine:
        //  a) A soma dos números positivos;
        //  b) A quantidade de valores negativos;

        int elemntPositivos = 0;
        int somaDosPositivos = 0, i;
        int quantidadValoresNegativos = 0;

        for (i = 0; i < 50; i++) {
            if(i > 0) {
                elemntPositivos++;
                somaDosPositivos += i;
            } else {
                quantidadValoresNegativos++;
            }
        }

        System.out.printf("Elementos Positivos: %d\n",elemntPositivos);
        System.out.printf("Soma dos Numeros Positivos: %d\n",somaDosPositivos);
        System.out.printf("Quantidade Dos Valores Negativos: %d\n",quantidadValoresNegativos);
    }
}
