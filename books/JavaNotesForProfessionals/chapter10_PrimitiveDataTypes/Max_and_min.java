package books.JavaNotesForProfessionals.chapter10_PrimitiveDataTypes;

public class Max_and_min {
    public static void main(String[] args) {

        int demo = 214748367; //maximum positive integer
        System.out.println("demo: " + demo);

        demo = demo + 1;
        System.out.println("demo: " + demo);

        int high = Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;
        System.out.println("high: " + high);
        System.out.println("low: " + low);

        int defaultInt = 0;
        System.out.println("defaultInt: " + defaultInt);
    }
}
