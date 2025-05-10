package AulasDoYoutube.broCode.oop.javaCourse2023.part15_superKeyword;

public class Hero extends Person{

    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }
}
