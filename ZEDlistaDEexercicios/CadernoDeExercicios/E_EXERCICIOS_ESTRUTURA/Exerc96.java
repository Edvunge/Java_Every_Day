package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

public class Exerc96 {
    public static void main(String[] args) {
        //  96. Escreva um algoritmo que calcule o produto dos inteiros ímpares de 1 a 15 e,
        //  então, exiba os resultados.
        System.out.print("\nOS NUMEROS IMPARES DE 1 A 15 SAO: \n");

        for (int i = 1; i < 15; i++) {
            if(i % 2 != 0) {
                System.out.printf(" %d ",i);
            }
        }
    }
}
