package ZEDlistaDEexercicios.CadernoDeExercicios.E_EXERCICIOS_ESTRUTURA;

public class Exerc91 {
    //  91. Faça um algoritmo que imprima todos os números pares compreendidos entre 85 e 907.
    //  O algoritmo deve também calcular a soma destes valores.
    public static void main(String[] args) {
        int somaDosPares = 0;
        for(int i = 85; i < 907; i++) {
            if (i % 2 == 0) {
                somaDosPares += i;
            }
        }
        System.out.printf("A soma dos numeros pares: %d ",somaDosPares);
    }
}
