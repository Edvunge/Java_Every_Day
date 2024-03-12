package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

public class Exerc90 {
    // 90. Faça um algoritmo que imprima os múltiplos positivos de 7, inferiores a 1000.
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 7 == 0) {
                System.out.printf(" %d  \n",i);
            }
        }
    }
}
