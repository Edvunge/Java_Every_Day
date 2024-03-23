package ZEDlistaDEexercicios.Lista_3_ComandosRepetetivos.Anexo1a20;

public class Exerc06 {
    // 6. Faça um programa que leia 10 inteiros e imprima sua média.
    public static void main(String[] args) {
        double soma = 0, media = 0;

        for (int i = 0; i < 10; i++) {
            soma += i;
        }

        media = (soma/10);
        System.out.printf("a media dos 10 numeros eh: %.2f",media);
    }
}
