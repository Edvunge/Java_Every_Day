package books.JavaNotesForProfessionals.chapter11_Strings.section11_1_ComparingStrings;

public class ComparingStringsWithSwitchStatement {
    public static void main(String[] args) {
        String stringToSwitch = "A";

        switch (stringToSwitch) {
            case "a":
                System.out.println("a");
                break;
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                break;
        }
    }
}
