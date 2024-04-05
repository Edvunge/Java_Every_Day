package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

public class Exerc08 {
    public static void main(String[] args) {
        // 8. Escreva um programa que leia 10 numeros e escreva o menor valor lido e o maior valor lido.
        int minValue = 0, maxValue = 0;

        for (int i = 0; i < 10; i++) {
            if (i > maxValue) {
                maxValue = i;
            } else {
                minValue = i;
            }
        }

        System.out.println("O Maior valor: " + maxValue);
        System.out.println("O Menor valor: " + minValue);

    }
}
