package JavaNotesForProfessionals.cap48_ClassesAndObjects.overloadingMethods;

public class Displayer {
    public void displayName(String firstName) {
        System.out.println("Name is: " + firstName);
    }

    public void displayName(String firstName, String lastName) {
        System.out.println("Name is: " + firstName + " " + lastName);
    }
}
