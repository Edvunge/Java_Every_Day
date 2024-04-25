package ExercsResolvidosDeAlgoritmos.Lista_3.B;

public class Algoritmo181 {
    public static void main(String[] args) {
        int i, soma;
        soma = 0;

        for (i = 1; i <= 100; i++) {
            soma = soma + i;
            System.out.println(i + " ");
        }
        System.out.println("\nSomatorio de 1 a 100: " + soma);
        System.out.println("\n");
    }
}
