package sites.devJava.oop.chapter01_class_and_objects;

public class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public double computePayment(
                    double loanAmt,
                    double rate,
                    double futureValue,
                    int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest),
                        - numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator)
                        - ((futureValue * partial1) / denominator);
        return answer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
