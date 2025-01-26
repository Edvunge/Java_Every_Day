package books.Introd_oop_rafaelSantos.part_I_introdOOP.chapter01_introdProgramOO;

public class HelloWorld {
    public void greetings() {
        System.out.println("Hello World!");
        System.out.println("in OOP book");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.greetings();
    }
}
