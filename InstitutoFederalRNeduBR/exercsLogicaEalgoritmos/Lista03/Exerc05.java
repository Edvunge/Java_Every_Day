package InstitutoFederalRNeduBR.exercsLogicaEalgoritmos.Lista03;

public class Exerc05 {
    //5. imprima todos os números de 1 a 100 e a soma deles.
    public static void main(String[] args) {
        int soma = 0;

        for (int n = 1; n <= 100; n++) {
            soma += n;
        }

        System.out.println("A Soma dos valores: " + soma);
    }
}
