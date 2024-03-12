package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

public class Exerc88 {
    public static void main(String[] args) {
        // 88. Some os números de 1 a 100 e imprima o valor.
        int soma = 0;
        for (int i = 1; i < 100; i++) {
            soma += i;
        }
        System.out.printf("A soma de todos os numeros: %d",soma);
    }
}
