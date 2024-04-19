package ExercsResolvidosDeAlgoritmos.Lista_3.A;

public class Algoritmo167 {
    public static void main(String[] args) {
        int l, c, t;
        System.out.println("\nACIMA DA DIAGONAL PRINCIPAL\n");

        for (l = 1; l <= 9; l++) {
            for (c = l + 1; c <= 10; c++) {
                System.out.println("\t" + l + "-" + c);
            }
            System.out.println("\n");
            for (t = 1; t <= l; t++) {
                System.out.println("\t");
            }
        }
        System.out.println("\n");
    }
}
