package AulasDoYoutube.broCode.oop.javaCourse2023.part20_interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
