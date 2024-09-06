package JavaNotesForProfessionals.cap54_Inheritance.sect54_9VariableShadowing;

public class SportsCar extends Car {
    public int gearRatio = 9;

    public String accelerate() {
        return "Accelerate : SportsCar";
    }

    public void test() {

    }


    public static void main(String[] args) {
        Car car = new SportsCar();
        System.out.println(car.gearRatio + "  " + car.accelerate());
    }
}
