package ExercsResolvidosDeAlgoritmos.Lista_3.A;

public class Algoritmo171 {
    public static void main(String[] args) {
        int l, c, t;

        System.out.println("\nDIAGONAL SECUNDARIA\n");
        for (l = 1; l <= 10; l++) {
            for (t = 10 - l; t >= 1; t--) {
                System.out.println("\t");
            }
            System.out.printf(String.valueOf(l), "-" , 11-l , "\n");
        }
        System.out.println("\n");
    }
}
