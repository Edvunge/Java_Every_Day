package sites.devJava.oop.chapter03_interface;

public interface Bicycle {

    // wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
