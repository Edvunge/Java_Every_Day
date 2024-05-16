package JavaNotesForProfessionals.cap_48_ClassesAndObjects.overloadingMethods;

public class AppCar {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.nameCar("Ferrari");
        myCar.paintCar("Purple");
        myCar.setNumGallonsInTank(10);
        myCar.setMPG(30);
    }
}
