package AulasDoYoutube.broCode.oop.toString;

public class Car {

    public String make = "Chevrolet";
    public String model = "Corvette";
    public int year = 2020;
    public String color = "blue";

    public String toString() {
        String myString = make + "\n" + model + "\n" + color + "\n" + year;

        return myString;
    }
}
