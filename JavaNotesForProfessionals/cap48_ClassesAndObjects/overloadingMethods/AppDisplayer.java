package JavaNotesForProfessionals.cap48_ClassesAndObjects.overloadingMethods;

public class AppDisplayer {
    public static void main(String[] args) {
        Displayer displayer = new Displayer();
        displayer.displayName("Ram");
        displayer.displayName("Jon", "Skeet");
    }
}
