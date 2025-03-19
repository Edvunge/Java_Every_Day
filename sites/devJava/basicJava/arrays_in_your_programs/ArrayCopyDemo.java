package sites.devJava.basicJava.arrays_in_your_programs;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyForm = {
                "ncidunt",  "arcua", "venenatis", "Aliquam",
                "consectetur", "eget", "justo", "Sed", "eulorem", "eleifend",
                "velit", "estdictum", "dictum", "quis", "consectetur",
                "eget", "justo", "Sed", "eulorem", "eleifend"
        };

        String[] copyTo = new String[7];
        //System.out.println(copyForm, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
    }
}
