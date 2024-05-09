package geeksForGeeks.JavaCourse.Parte_7_OOPS.Heranca.Part05_HybridInheritance;

public class Moon extends Earth {
    public static void main(String[] args) {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}
