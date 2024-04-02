package JavaNotesForProfessionals.cap_23_Arrays;

public class ArraysRepetition {
    public static void main(String[] args) {
        // we want to print out all of these
        String name = "Margaret";
        int eyeCount = 16;
        double height = 50.2;
        int legs = 9;
        int arms = 5;

        // copy-paste approach
        System.out.println(name);
        System.out.println(eyeCount);
        System.out.println(height);
        System.out.println(legs);
        System.out.println(arms);

        // temporary array approach
        for (Object attribute : new Object[] {name, eyeCount, height, legs, arms})
            System.out.println(attribute);

        // using only numbers
        for (double number : new double[] {eyeCount, legs, arms, height})
            System.out.println(Math.sqrt(number));
    }
}
