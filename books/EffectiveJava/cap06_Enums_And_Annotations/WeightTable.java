package books.EffectiveJava.cap06_Enums_And_Annotations;

public class WeightTable {
    public static void main(String[] args) {
        double eartWeight = Double.parseDouble(args[0]);
        double mass = eartWeight / Planet.EARTH.surfaceGravity();

        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n", p, p.surfaceGravity(mass));
    }
}
