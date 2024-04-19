package ExercsResolvidosDeAlgoritmos.Lista_3.A;

public class Algoritmo168 {
    public static void main(String[] args) {
        int l, c, t;

        System.out.println("\nDIAGONAL PRINCIPAL\n");
        for (l = 1; l <= 10; l++) {
            System.out.println(l + "-" + l + "\n");
            for (t = 1; t <= l; t++) {
                System.out.println("\t");
            }
        }
        System.out.println("\n");
    }
}
