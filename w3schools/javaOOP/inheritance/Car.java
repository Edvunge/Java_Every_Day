package w3schools.javaOOP.inheritance;

public class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {

        // create a myCar object
        Car myCar = new Car();

        // call the honk method
        myCar.honk();

        // display the value of the brand
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
