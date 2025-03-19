package sites.devJava.basicJava.arrays_in_your_programs;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyForm = {
                "ncidunt",  "arcua", "venenatis", "Aliquam",
                "consectetur", "eget", "justo", "Sed", "eulorem", "eleifend",
                "velit", "estdictum", "dictum", "quis", "consectetur",
                "eget", "justo", "Sed", "eulorem", "eleifend"
        };

        String[] copyTo = java.util.Arrays.copyOfRange(copyForm, 2, 9);
        //System.out.println(copyForm, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
    }
}
