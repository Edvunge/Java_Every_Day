package JavaProgrammingMasterclass.section_4_IntellijBasics;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
    }
}
