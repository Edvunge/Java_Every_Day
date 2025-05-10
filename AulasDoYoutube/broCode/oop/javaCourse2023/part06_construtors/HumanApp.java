package AulasDoYoutube.broCode.oop.javaCourse2023.part06_construtors;

public class HumanApp {
    public static void main(String[] args) {
        Human human1 = new Human("rick", 45, 70);
        Human human2 = new Human("morty", 16, 50);

        human2.eat();
        human1.drink();
    }
}
