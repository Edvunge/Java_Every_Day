package ExercsResolvidosDeAlgoritmos.Lista_3.A;

public class Algoritmo172 {
    public static void main(String[] args) {
        int l, c, t;

        System.out.println("\nABAIXO DA DIAGONAL SECUNDARIA\n");
        System.out.println("\n");

        for (l = 2; l <= 10; l++){
            for(t = 11-l; t >= 1; t--){
                System.out.println("\t");
            }
            for (c = 12-l; c <= 10; c++){
                System.out.println("\n");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
